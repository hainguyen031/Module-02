public class QuadraticEquation {
    private double a, b, c, delta;
    public QuadraticEquation() {
    }
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        this.delta = b * b - 4 * a * c;
        return this.delta;
    }

    public void getRoot() {
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            double r = -this.b / (2 * this.a);
            System.out.println("Phương trình có nghiệm kép: x = " +r);
        } else {
            double r1 = (-this.b + Math.pow(this.delta, 0.5)) / (2 * this.a);
            double r2 = (-this.b - Math.pow(this.delta, 0.5)) / (2 * this.a);
            System.out.println("Phương trình có 2 nghiệm: x1 = " +r1 + " , x2 = " +r2 );
        }
    }
}
