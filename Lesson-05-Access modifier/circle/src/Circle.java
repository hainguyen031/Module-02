public class Circle {
    private double radius = 1.0;
    private String color = "red";
    Circle() {
    }
    Circle(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double result = 3.14 * this.radius * this.radius;
        return result;
    }

}
