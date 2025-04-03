class Student {
    private static String uniName = "SRM University";
    private static int totalStu = 0;

    private final int rollNum;
    private String name;
    private char grade;

    public Student(int rollNum, String name, char grade) {
        this.rollNum = rollNum;
        this.name = name;
        this.grade = grade;
        totalStu++;
    }

    public static void disTotalStu() {
        System.out.println("Total Students = " + totalStu);
    }

    public void disStu() {
        if (this instanceof Student) {
            System.out.println("University = " + uniName);
            System.out.println("Roll Num = " + this.rollNum);
            System.out.println("Name = " + this.name);
            System.out.println("Grade = " + this.grade);
        } else {
            System.out.println("Invalid");
        }
    }

    public void upgradeGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(387, "Ruchi", 'A');
        Student s2 = new Student(105, "Vandit", 'C');

        s1.disStu();
        s2.disStu();
        disTotalStu();

        s2.upgradeGrade('B');
        System.out.println("Updated grade:");
        s2.disStu();
    }
}
