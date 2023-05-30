import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap a");
            int a = scanner.nextInt();
            System.out.println("Nhap b");
            int b = scanner.nextInt();
            System.out.println("Nhap c");
            int c = scanner.nextInt();
            checkTriangle(a, b, c);
            System.out.println("a,b,c la 3 canh cua 1 tam giac");
        } catch (IllegalTriangleException e) {
            System.out.println(" error: " + e.getMessage());
        }
    }

    private static void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalTriangleException();
        }
    }
}
