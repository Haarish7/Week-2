class Employee {
    String name;
    int id;
    int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void disDetails() {
        System.out.println("Employee Details");
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
        System.out.println("Salary = " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ruchi", 387 , 450000);
        emp1.disDetails();
    }
}
