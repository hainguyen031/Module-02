public class TriangleClassifier {
    private int a, b, c;
    private final int isosceles = 1;
    private final int equilateral = 2;
    private final int scalene = 3;
    private final int notTriangle = 0;
    public void setTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int getTriangle() {
        if (checkTriangle()) {
            if ( a == b && b == c ) {
                return isosceles;
            } else if (a==b || a==c || b==c) {
                return equilateral;
            } else {
                return scalene;
            }
        } else {
            return notTriangle;
        }

    }

    private boolean checkTriangle() {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
}
