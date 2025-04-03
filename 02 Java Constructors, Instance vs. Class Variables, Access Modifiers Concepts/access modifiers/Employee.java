class Employee {
    public int empID;
    protected String dept;
    private double salary;

    public Employee(int empID, String dept, double salary) {
        this.empID = empID;
        this.dept = dept;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated = " + salary);
        } else {
            System.out.println("Invalid");
        }
    }

    public void disEmp() {
        System.out.println("Employee ID = " + empID);
        System.out.println("Department = " + dept);
        System.out.println("Salary = " + salary);
    }
}

class Manager extends Employee {
    private String team;

    public Manager(int empID, String dept, double salary, String team) {
        super(empID, dept, salary);
        this.team = team;
    }

    public void disManager() {
        System.out.println("Manager details:");
        System.out.println("Employee ID = " + empID);
        System.out.println("Department = " + dept);
        System.out.println("Team = " + team);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(387, "IT", 700000);
        emp.disEmp();
        emp.setSalary(500000);

        Manager mgr = new Manager(564, "HR", 1000000, "Recruitment");
        mgr.disManager();
        mgr.setSalary(1500000);
    }
}


