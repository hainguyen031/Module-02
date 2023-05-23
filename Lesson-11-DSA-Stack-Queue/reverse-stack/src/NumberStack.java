import java.util.Scanner;
import java.util.Stack;

public class NumberStack {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int n = array.length;

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < n; i++) {
            stack.push(array[i]);
        }


        for (int i = 0; i < n; i++) {
            array[i] = stack.pop();
        }


        System.out.print("Mảng sau khi hoán đổi: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }


}
