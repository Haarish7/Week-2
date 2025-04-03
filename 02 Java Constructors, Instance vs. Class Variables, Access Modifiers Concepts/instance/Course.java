class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "SRM University";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void disCourseDetails() {
        System.out.println("Institute Name = " + instituteName);
        System.out.println("Course Name = " + courseName);
        System.out.println("Duration = " + duration);
        System.out.println("Fees = " + fee);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 2, 1500);
        Course c2 = new Course("Data Science", 6, 10000);

        c1.disCourseDetails();
        c2.disCourseDetails();

        Course.updateInstituteName("SRM Institute of Science and Technology");

        System.out.println("After updating: ");
        c1.disCourseDetails();
        c2.disCourseDetails();
    }
}
