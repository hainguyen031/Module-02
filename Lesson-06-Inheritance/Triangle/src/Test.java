import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1 = 0;
        double side2 = 0;
        double side3 = 0;
        boolean isSideOfTriangle = false;
        do {
            System.out.print("Nhập chiều dài cạnh thứ 1: ");
            side1 = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập chiều dài cạnh thứ 2: ");
            side2 = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập chiều dài cạnh thứ 3: ");
            side3 = Double.parseDouble(scanner.nextLine());
            isSideOfTriangle = (side1 + side2 > side3) && (side1 + side3 > side2) && (side3 + side2 > side1);
            if (isSideOfTriangle) {
                break;
            } else {
                System.out.println("3 số vừa nhập không phải là hình tam giác");
            }
        } while (true);

        System.out.print("Nhập màu của hình: ");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(color, side1, side2, side3);
        System.out.println(triangle);
    }

}
