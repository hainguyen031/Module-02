import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang cua mang: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so cot cua mang: ");
        int b = scanner.nextInt();
        int[][] array = new int[a][b];

        for (int i = 0; i < a ; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("array[" + i + "][" + j + "]= ");
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Mang 2 chieu:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Cot muon tinh tong: ");
        int x = scanner.nextInt();
        if (x <= b && x>= 0) {
            int sum = 0;
            for (int row = 0; row < array.length; row++) {
                sum += array[row][x];
            }
            System.out.println("Tong cua cot " + x + " la: " + sum);
        } else {
            System.out.println("Nhap sai, xin nhap lai");
        }
    }
}
