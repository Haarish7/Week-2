import java.util.*;

class Stud {
    private String name;
    private int id;
    private List<Courses> enrolledCourses;

    public Stud(String name, int id) {
        this.name = name;
        this.id = id;
        enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Courses course) {
        enrolledCourses.add(course);
        course.addStud(this);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }

    public void displayCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (Courses c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}

class Professor {
    private String name;
    private String department;

    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public void assignToCourse(Courses course) {
        course.assignProfessor(this);
        System.out.println(name + " is assigned to teach " + course.getCourseName());
    }

    public String getName() {
        return name;
    }
}

class Courses {
    private String courseName;
    private Professor professor;
    private List<Stud> studs;

    public Courses(String courseName) {
        this.courseName = courseName;
        studs = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStud(Stud stud) {
        studs.add(stud);
    }

    public void displayCourseDetails() {
        System.out.println("Course = " + courseName);
        System.out.println("Professor = " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Stud s : studs) {
            System.out.println("- " + s.getName());
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Stud s1 = new Stud("Ruchi", 387);
        Stud s2 = new Stud("Vandit", 105);

        Professor p1 = new Professor("Dr. Ami", "Computer Science");

        Courses c1 = new Courses("Data Structures");

        p1.assignToCourse(c1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        c1.displayCourseDetails();
        s1.displayCourses();
        s2.displayCourses();
    }
}
