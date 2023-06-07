public class ShapeFactory {
    private Shape shape;
    public ShapeFactory() {
    }

    public void drawShape(String shapeName) {
        if(shapeName.equals("circle")) {
            shape = new Circle();
            shape.draw();
        } else if (shapeName.equals("square")) {
            shape = new Square();
            shape.draw();
        } else if (shapeName.equals("rectangle")) {
            shape = new Rectangle();
            shape.draw();
        }
    }
}
