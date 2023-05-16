public class Cylinder extends Circle{
    private double height = 1.0;
    public Cylinder() {}
    public Cylinder(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return super.toString()
                +" height="
                +getHeight()
                +" and the volume of Cylinder="
                +getVolume();
    }
}
