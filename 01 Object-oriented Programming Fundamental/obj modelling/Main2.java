import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void disEmp() {
        System.out.println("Employee Name = " + name);
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    void addEmp(String empname) {
        Employee emp = new Employee(empname);
        employees.add(emp);
    }

    void disDept() {
        System.out.println("Department = " + deptName);
        for (Employee e : employees) {
            e.disEmp();
        }
    }
}

class Company {
    String cmpName;
    ArrayList<Department> departments;

    Company(String cmpName) {
        this.cmpName = cmpName;
        departments = new ArrayList<>();
    }

    void addDept(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
    }

    Department getDept(String deptName) {
        for (Department d : departments) {
            if (d.deptName.equalsIgnoreCase(deptName)) {
                return d;
            }
        }
        return null;
    }

    void disCmp() {
        System.out.println("Company = " + cmpName);
        for (Department d : departments) {
            d.disDept();
        }
    }

    void delCmp() {
        departments.clear();
        System.out.println("Company " + cmpName + " and all depts/emps deleted");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Company comp = new Company("Capgemini");

        comp.addDept("HR");
        comp.addDept("Engineering");

        Department hr = comp.getDept("HR");
        if (hr != null) {
            hr.addEmp("Ruchi");
            hr.addEmp("Vandit");
        }

        Department eng = comp.getDept("Engineering");
        if (eng != null) {
            eng.addEmp("Ami");
            eng.addEmp("Bhadrik");
        }

        comp.disCmp();
        comp.delCmp();
    }
}

