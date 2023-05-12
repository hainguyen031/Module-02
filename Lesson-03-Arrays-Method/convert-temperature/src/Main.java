import java.util.Scanner;
public class Main {
    public static double cToF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double fToC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double doF;
        double doC;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    doF = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fToC(doF));
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    doC = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + cToF(doC));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
}
