interface Department {
    void assignDept(String deptName);
    String getDeptDetails();
}

abstract class Employee implements Department {
    private int employeeID;
    private String name;
    private double baseSalary;
    private String dept;

    public Employee(int employeeID, String name, double baseSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calcSalary();

    public void display() {
        System.out.println("Employee ID = " + employeeID);
        System.out.println("Name = " + name);
        System.out.println("Base Salary = " + baseSalary);
        System.out.println("Department = " + dept);
        System.out.println("Final Salary = " + calcSalary());
    }

    public int getEmployeeID() { return employeeID; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public void assignDept(String deptName) {
        this.dept = deptName;
    }

    @Override
    public String getDeptDetails() {
        return "Department = " + dept;
    }
}

class FullTimeEmp extends Employee {
    public FullTimeEmp(int employeeID, String name, double baseSalary) {
        super(employeeID, name, baseSalary);
    }

    @Override
    public double calcSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmp extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmp(int employeeID, String name, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeID, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calcSalary() {
        return hoursWorked * hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new FullTimeEmp(1001, "Ruchi", 1500000);
        employees[0].assignDept("HR");

        employees[1] = new PartTimeEmp(1007, "Vandit", 0, 120, 2500);
        employees[1].assignDept("Support");

        employees[2] = new FullTimeEmp(1002, "Bhadrik", 700000);
        employees[2].assignDept("Finance");

        for (Employee emp : employees) {
            emp.display();
        }
    }
}
