public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Square(6);
        shapes[1] = new Rectangle(2, 6);
        System.out.println("Area of shapes: ");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());

            if (shape instanceof Square) {
                System.out.println("shape square has a Colorable");
                ((Square) shape).howToColor();
            }
            System.out.println();
        }
    }

}