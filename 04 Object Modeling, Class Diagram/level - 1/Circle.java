class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return (Math.PI * radius * radius);
    }

    public double circumference() {
        return (Math.PI * 2 * radius);
    }

    public void disRes() {
        System.out.println("Area = " + area());
        System.out.println("Circumference = " + circumference());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.disRes();
    }
}
