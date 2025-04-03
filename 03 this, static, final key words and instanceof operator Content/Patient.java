class Patient {
    private static String hosName = "SRM Global Hospital";
    private static int totalPat = 0;

    private String name;
    private int age;
    private String ailment;
    private final String patientID;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPat++;
    }

    public static void  getTotalPat() {
        System.out.println("Total Patients = " + totalPat);
    }

    public void disPat() {
        if (this instanceof Patient) {
            System.out.println("Hospital = " + hosName);
            System.out.println("Patient ID = " + this.patientID);
            System.out.println("Name = " + this.name);
            System.out.println("Age = " + this.age);
            System.out.println("Ailment = " + this.ailment);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Ruchi", 22, "Flu", "P101");
        Patient p2 = new Patient("Vandit", 14, "Dengue", "P201");

        p1.disPat();
        p2.disPat();
        getTotalPat();
    }
}
