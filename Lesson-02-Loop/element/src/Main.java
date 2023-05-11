import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of primes your want display:");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;

        while ( count < number) {

                int i = 2;
                boolean check = true;
                while (i <= Math.sqrt(N)) {
                    if (N % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    System.out.print(N + " ");
                    count++;
                }
                N++;
            }
        }
    }

