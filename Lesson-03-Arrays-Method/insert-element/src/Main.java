import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        array = new int[]{2, 6, 4, 8, 8, 6, 4, 3, 1};
        System.out.print("Nhap so can chen: ");
        int x = scanner.nextInt();
        System.out.print("Nhap index so can chen: ");
        int index = scanner.nextInt();
        if (index <= -1 || index >= array.length-1) {
            System.out.println("Khong chen duoc phan tu vao mang");
        } else {
            for (int i = array.length-1; i >= index + 1; i--) {
                array[i] = array[i-1];
            }
            array[index] = x;
        }
        System.out.println("Mang sau khi chen: " + Arrays.toString(array));
    }
}
