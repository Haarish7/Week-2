class Employee {
    private static String companyName = "Capgemini";
    private static int totlEmp = 0;

    private String name;
    private final int id;
    private String degn;

    public Employee(String name, int id, String degn) {
        this.name = name;
        this.id = id;
        this.degn = degn;
        totlEmp++;
    }

    public static void disTotalEmp() {
        System.out.println("Total Employees = " + totlEmp);
    }

    public void disEmp() {
        if (this instanceof Employee) {
            System.out.println("Company Name = " + companyName);
            System.out.println("Employee ID = " + id);
            System.out.println("Name = " + name);
            System.out.println("Designation = " + degn);
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ruchi", 101, "Software Engineer");
        Employee emp2 = new Employee("Vandit", 105, "Project Manager");

        emp1.disEmp();
        emp2.disEmp();
        disTotalEmp();
    }
}
