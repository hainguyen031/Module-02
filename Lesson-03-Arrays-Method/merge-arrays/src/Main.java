import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        int size2;
        int[] array1;
        int[] array2;
        int[] array3;
        //Mang 1
        do {
            System.out.print("Nhap chieu dai mang 1: ");
            size1 = scanner.nextInt();
            if (size1 > 20 ) {
                System.out.println("Mang qua dai, vui long nhap lai");
            }
        } while (size1 > 20);
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mang 1: " + Arrays.toString(array1));
        //Mang 2
        do {
            System.out.print("Nhap chieu dai mang 2: ");
            size2 = scanner.nextInt();
            if (size2 > 20 ) {
                System.out.println("Mang qua dai, vui long nhap lai");
            }
        } while (size2 > 20);
        array2 = new int[size2];
        int j = 0;
        while (j < array2.length) {
            System.out.print("Enter element " + (j + 1) + ": ");
            array2[j] = scanner.nextInt();
            j++;
        }
        System.out.println("Mang 2: " + Arrays.toString(array2));
        //Mang 3
        int size3 = size1 + size2;
        array3 = new int[size3];
        for (int x = 0; x < array1.length; x++) {
            array3[x] = array1[x];
        }
        int z = array2.length+1;
        for (int y = 0; y < array2.length; y++) {
            array3[z] = array2[y];
            z++;
        }
        System.out.println("Mang 3: " + Arrays.toString(array3));
    }
}
