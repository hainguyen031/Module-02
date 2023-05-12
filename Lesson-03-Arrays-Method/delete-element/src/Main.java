import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] array;
        array = new int[]{2, 6, 4, 8, 7, 5, 9, 3, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap phan tu can xoa: ");
        int x = scanner.nextInt();
        int index_del = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index_del = i;
            }
        }
        if (index_del != -1) {
            for (int j = index_del; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = 0;
        }
        System.out.println("Mang sau khi khoa: " + Arrays.toString(array));
    }
}


