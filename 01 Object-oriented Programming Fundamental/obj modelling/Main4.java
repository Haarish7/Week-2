import java.util.ArrayList;

class Faculty {
    String name;
    String specialization;

    Faculty(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    void disDetails() {
        System.out.println("Faculty = " + name + ", Specialization = " + specialization);
    }
}

class Dept {
    String deptName;

    Dept(String deptName) {
        this.deptName = deptName;
    }

    void displayDetails() {
        System.out.println("Department = " + deptName);
    }
}

class University {
    String uniName;
    ArrayList<Dept> department;
    ArrayList<Faculty> faculties;

    University(String uniName) {
        this.uniName = uniName;
        this.department = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    void addDept(Dept dept) {
        department.add(dept);
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void showDept() {
        System.out.println("Departments in " + uniName + ":");
        for (Dept d : department) {
            d.displayDetails();
        }
    }

    void showFaculties() {
        System.out.println("Faculties in " + uniName + ":");
        for (Faculty f : faculties) {
            f.disDetails();
        }
    }

    void delUni() {
        System.out.println("Deleting University = " + uniName);
        department.clear();
        System.out.println("All departments deleted");
    }
}

public class Main4 {
    public static void main(String[] args) {
        University uni = new University("SRM University");

        Dept d1 = new Dept("Computer Science");
        Dept d2 = new Dept("Mechanical Engineering");

        Faculty f1 = new Faculty("Dr. Uma", "Signal Processing");
        Faculty f2 = new Faculty("Dr. Beaulah", "AI");

        uni.addDept(d1);
        uni.addDept(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDept();
        uni.showFaculties();

        uni.delUni();

        System.out.println("Faculty Members still exist: ");
        f1.disDetails();
        f2.disDetails();
    }
}
