public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory newshape1 = new ShapeFactory();
        newshape1.drawShape("circle");

        ShapeFactory newshape2 = new ShapeFactory();
        newshape2.drawShape("rectangle");
    }
}
