import java.util.ArrayList;

class Course {
   String courseName;
   ArrayList<Student> enrolledStudents;

   Course(String courseName) {
       this.courseName = courseName;
       this.enrolledStudents = new ArrayList<>();
   }

   void enrollStudent(Student student) {
       if (!enrolledStudents.contains(student)) {
           enrolledStudents.add(student);
       }
       if (!student.courses.contains(this)) {
           student.courses.add(this);
       }
   }

   void showEnrolledStudents() {
       System.out.println("Students enrolled in " + courseName + ":");
       for (Student s : enrolledStudents) {
           System.out.println("- " + s.name);
       }
   }
}

class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollInCourse(Course course) {
        course.enrollStudent(this);
    }

    void showEnrolledCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showAllStudents() {
        System.out.println("Students at " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        School school = new School("MES Indian School");

        Student s1 = new Student("Ruchi");
        Student s2 = new Student("Vandit");

        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollInCourse(math);
        s1.enrollInCourse(science);

        s2.enrollInCourse(science);

        school.showAllStudents();

        s1.showEnrolledCourses();
        s2.showEnrolledCourses();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
