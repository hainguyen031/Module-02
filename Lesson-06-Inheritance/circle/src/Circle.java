public class Circle {
    private static double radius = 1.0;
    private static String color = "blue";
    public Circle() {}
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                +getRadius()
                +", color is "
                +getColor()
                +" and Area="
                +getArea();
    }
}
