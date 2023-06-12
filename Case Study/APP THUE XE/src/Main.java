import entity.Staff;
import entity.User;
import service.CarService;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        boolean exit = false;
        CarService carService = new CarService();
        User staff = new Staff();
        showMenuCustomer();
        while (true) {
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    ((Staff) staff).addCar();
                    break;
                case 2:
                    CarService.showList();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 0:
                    System.out.println("Exited !");
                    exit = true;
                    break;
            }
            if (exit) {
                break;
            }
            showMenuCustomer();
        }
    }

    private static void showMenuCustomer() {
        System.out.println("CAR RENTAL APP");
        System.out.println("1. Add car");
        System.out.println("2. Show list car");
        System.out.println("3. Search car");
        System.out.println("4. View car detail");
        System.out.println("5. Book car");
        System.out.println("6. Down payment");
        System.out.println("7. History");
        System.out.println("8. Invoice");
        System.out.println("0. Exit");
        System.out.println("Your option: ");
    }
    private static void showMenuStaff() {
        System.out.println("RENTAL CAR MANAGEMENT");
        System.out.println("1. Add car");
        System.out.println("2. Delete car");
        System.out.println("3. tình trạng xe");
        System.out.println("4. tạo đơn giao xe tới điểm thuê");
        System.out.println("5. Xác nhận tình trạng xe khi cho thuê");
        System.out.println("6. Thanh toán");
        System.out.println("0. Exit");
    }

}
