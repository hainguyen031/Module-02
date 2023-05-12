import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap size cua mang: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("array: " + Arrays.toString(array));

        int min = array[0];
        for (int j =1; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println(("So min trong mang: " + min));
    }
}
