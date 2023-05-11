public class Main {
    public static void main(String[] args) {
        System.out.println("Cac so nguyen to nho hon 100: ");
        int number = 2;
        while (number < 100) {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(number + " ");
            }
            number++;

        }
    }
}
