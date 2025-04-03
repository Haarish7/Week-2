class Student {
    String name;
    int rollNum;
    double marks;

    public Student(String name, int rollNum, double marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }

    public char calcGrade() {
        if (marks >= 80) return 'O';
        else if (marks >= 70 && marks <= 79) return 'B';
        else if (marks >= 60 && marks <= 69) return 'C';
        else if (marks >= 50 && marks <= 59) return 'D';
        else if (marks >= 40 && marks <= 49) return 'E';
        else if (marks <= 39) return 'R';
        return 0;
    }

    public void disDetails() {
        System.out.println("Student Details");
        System.out.println("Name = " + name);
        System.out.println("Roll Num = " + rollNum);
        System.out.println("Marks = " + marks);
    }

    public static void main(String[] args) {
        Student st1 = new Student("Ruchi", 387, 67);
        Student st2 = new Student("Vandit", 309, 99);

        st1.disDetails();
        System.out.println("Grade = " + st1.calcGrade());

        st2.disDetails();
        System.out.println("Grade = " + st2.calcGrade());
    }
}
