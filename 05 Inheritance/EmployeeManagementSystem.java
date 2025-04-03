class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID = " + id);
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    void display() {
        super.display();
        System.out.println("Role = Manager");
        System.out.println("Team size = " + teamSize);
    }
}

class Developer extends Employee {
    String progLang;

    Developer(String name, int id, double salary, String progLang) {
        super(name, id, salary);
        this.progLang = progLang;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Role = Developer");
        System.out.println("Programming Language = " + progLang);
    }
}

class Intern extends Employee {
    int internshipDuration;

    Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Role = Intern");
        System.out.println("Internship duration = " + internshipDuration);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Ruchi", 101, 1500000, 5);
        Employee developer = new Developer("Vandit", 106, 600000, "Java");
        Employee intern = new Intern("Ami", 201, 50000, 6);

        manager.display();
        developer.display();
        intern.display();
    }
}
