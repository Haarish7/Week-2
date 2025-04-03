class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void display() {
        System.out.println("Course Name = " + courseName);
        System.out.println("Duration = " + duration);
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Platform = " + platform);
        System.out.println("Recorded = " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double getFinalFee() {
        return (fee - (fee * discount / 100));
    }

    @Override
    void display() {
        super.display();
        System.out.println("Course Fee = " + fee);
        System.out.println("Discount = " + discount);
        System.out.println("Final Fee after discount = " + getFinalFee());
    }
}

public class CourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java Programming", 6, "Coursera", true, 5000.0, 15.0);
        poc.display();
    }
}
