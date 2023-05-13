import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang, cot cua mang: ");
        int x = scanner.nextInt();
        int[][] array;
        array = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("array[" + i +"][" + j +"] = ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mang 2 chieu: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += array[i][i];
        }

        System.out.println("Tong duong cheo chinh: " +sum);
    }
}
