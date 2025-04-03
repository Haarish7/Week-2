import java.util.ArrayList;
import java.util.List;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient implements MedicalRecord{
    private int patientID;
    private String name;
    private int age;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientID, String name, int age) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
    }

    protected void getPatientDetails() {
        System.out.println("Patient ID = " + patientID);
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }

    public abstract double calcBill();

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical records:");
        for (String record : medicalHistory) {
            System.out.println("- " + record);
        }
    }
}

class Inpatient extends Patient {
    private int daysAdmitted;
    private double dailyRate;

    public Inpatient(int patientID, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientID, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    public double calcBill() {
        return daysAdmitted * dailyRate;
    }
}

class Outpatient extends Patient {
    private int consultantCount;
    private double consultationFee;

    public Outpatient(int patientID, String name, int age, int consultantCount, double consultationFee) {
        super(patientID, name, age);
        this.consultantCount = consultantCount;
        this.consultationFee = consultationFee;
    }

    public double calcBill() {
        return consultantCount * consultationFee;
    }
}

public class HospitalSystem {
    public static void processPatient(Patient patient) {
        patient.getPatientDetails();
        patient.viewRecords();
        System.out.println("Total Bill = " + String.format("%.2f", patient.calcBill()));
    }

    public static void main(String[] args) {
        Patient[] patients = new Patient[3];
        patients[0] = new Inpatient(1001, "Ruchi", 22, 5, 4000);
        patients[0].addRecord("Admitted for surgery");
        patients[0].addRecord("Prescribed antibiotics");

        patients[1] = new Outpatient(1002, "Bhadrik", 51, 10, 200);
        patients[1].addRecord("Regular checkup");
        patients[1].addRecord("Blood test conducted");

        processPatient(patients[0]);
        processPatient(patients[1]);
    }
}
