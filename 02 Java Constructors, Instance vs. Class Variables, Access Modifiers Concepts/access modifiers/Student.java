class Student {
    public int rollNum;
    protected String name;
    private double CGPA;

    public Student(int rollNum, String name, double CGPA) {
        this.rollNum = rollNum;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void disStudent() {
        System.out.println("Roll Number = " + rollNum);
        System.out.println("Name = " + name);
        System.out.println("CGPA = " + CGPA);
    }
}

class PostGrad extends Student {
    private String researchTopic;

    public PostGrad(int rollNum, String name, double CGPA, String researchTopic) {
        super(rollNum, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void disPG() {
        disStudent();
        System.out.println("Research topic = " + researchTopic);
    }

    public static void main(String[] args) {
        Student stu = new Student(387, "Ruchi", 9.35);
        stu.disStudent();

        PostGrad pgStu = new PostGrad(169, "Vandit", 9.4, "Machine Learning");
        pgStu.disPG();
    }
}
