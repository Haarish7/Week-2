import java.util.Scanner;

class Circle {
    double radius;

    Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void disDetails() {
        System.out.println("Radius = " + radius);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Circle c1 = new Circle();
        c1.disDetails();

        System.out.println("Enter radius = ");
        double radius = scn.nextDouble();

        Circle c2 = new Circle(radius);
        c2.disDetails();

        scn.close();
    }
}
