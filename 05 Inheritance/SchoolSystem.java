class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void display() {
        System.out.println("Role = Teacher");
        super.display();
        System.out.println("Subject = " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    void display() {
        System.out.println("Role = Student");
        super.display();
        System.out.println("Grades = " + grade);
    }
}

class Staff extends Person {
    String dept;

    Staff(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
    }

    @Override
    void display() {
        System.out.println("Role = Staff");
        super.display();
        System.out.println("Department = " + dept);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ami", 45, "Mathematics");
        Student student = new Student("Vandit", 15, "9th Grade");
        Staff staff = new Staff("Ruchi", 23, "Administration");

        teacher.display();
        student.display();
        staff.display();
    }
}
