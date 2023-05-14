import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2: aX2 + bX + c = 0");
        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();
        System.out.println("Phương trình có dạng: " + a + "X2 + " + b + "X + " + c + " = 0");

        QuadraticEquation giai = new QuadraticEquation(a, b, c);
        System.out.println("delta = " +giai.getDiscriminant());
        giai.getRoot();

        QuadraticEquation giai2 = new QuadraticEquation();
        giai2.setA(2);
        System.out.println("a = " + giai2.getA());
        giai2.setB(3);
        System.out.println("b = " + giai2.getB());
        giai2.setC(2);
        System.out.println("c = " + giai2.getC());
        giai2.getRoot();
    }
}
