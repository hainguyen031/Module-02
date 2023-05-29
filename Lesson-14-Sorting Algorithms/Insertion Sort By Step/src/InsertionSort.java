public class InsertionSort {
    static int[] list = {2, 9, 5, 3, 6, 7};
    public static void InsertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
                System.out.println("Loop:" +i + " chen " + list[k+1] + " = " + currentElement + " tai vi tri: " + k);
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        System.out.print("Before sort: ");
        for (int i = 0 ; i < list.length; i++) {
            System.out.print(list[i] +" ");
        }
        System.out.println();
        InsertionSort(list);
        System.out.print("After sort: ");
        for (int i = 0 ; i < list.length; i++) {
            System.out.print(list[i] +" ");
        }
    }
}
