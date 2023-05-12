import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so hang cua mang: ");
        int a = input.nextInt();
        System.out.print("Nhap so cot cua mang: ");
        int b = input.nextInt();
        int[][] matrix = new int[a][b];
        //Nhap phan tu trong mang
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }
        //In ra mang 2 chieu
        System.out.println("Mang 2 chieu:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //Tim max trong mang
        int max = 0;
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                if (matrix[x][y] > max) {
                    max = matrix[x][y];
                }
            }
        }
        System.out.println("Gia tri lon nhat trong mang: " + max);
    }
}
