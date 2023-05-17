public class Triangle extends Shape{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    public Triangle() {}
    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return this.side1;
    }
    public double getSide2() {
        return this.side2;
    }
    public double getSide3() {
        return this.side3;
    }
    public double getArea() {
        double p = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt( p * ( p - this.side1 ) * ( p - this.side2 ) * ( p - this.side3));
    }
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Chiều dài 3 cạnh tam giác lần lượt là: "
                +this.side1 +" "+ this.side2 +" "+ this.side3
                +", diện tích tam giác là: "
                +getArea()
                +", chu vi tam giác là: "
                +getPerimeter()
                +super.toString();
    }
}
