import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private int age;
    private List<Doctor> consultedDoctors;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
    }

    public void disDoc() {
        System.out.println("Patient " + name + " was consulted by: ");
        for (Doctor d : consultedDoctors) {
            System.out.println(" - Dr. " + d.getName());
        }
    }
}

class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String  getName() {
        return name;
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
        patients.add(patient);
        patient.addDoctor(this);
    }

    public void disPatient() {
        System.out.println("Dr. " + name + " has consulted:");
        for (Patient p : patients) {
            System.out.println("- Patient " + p.getName());
        }
    }
}

class Hospital {
    private String hosName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hosName) {
        this.hosName = hosName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void disAllDocs() {
        System.out.println("Doctors at " + hosName + ":");
        for (Doctor d : doctors) {
            System.out.println("- Dr. " + d.getName());
        }
    }

    public void disAllPat() {
        System.out.println("Patients at " + hosName + ":");
        for (Patient p : patients) {
            System.out.println("- " + p.getName());
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        Hospital hos = new Hospital("SRM Global Hospital");

        Doctor d1 = new Doctor("Ruchi", "Cardiology");
        Doctor d2 = new Doctor("Vandit", "Neurology");

        Patient p1 = new Patient("Bhadrik", 51);
        Patient p2 = new Patient("Ami", 47);

        hos.addDoctor(d1);
        hos.addDoctor(d2);
        hos.addPatient(p1);
        hos.addPatient(p2);

        d1.consult(p1);
        d2.consult(p1);
        d2.consult(p2);

        d1.disPatient();
        d2.disPatient();

        p1.disDoc();
        p2.disDoc();

        hos.disAllDocs();
        hos.disAllPat();
    }
}
