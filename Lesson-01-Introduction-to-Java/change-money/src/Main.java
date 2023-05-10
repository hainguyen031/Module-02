import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("USD can doi: ");
    Double change = scanner.nextDouble();
        System.out.println("VND : " + change * 23000);
    }
}
