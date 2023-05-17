public class Shape {
    private String color = "blue";
    public Shape() {}
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " Hình có màu là: " +getColor();
    }
}
