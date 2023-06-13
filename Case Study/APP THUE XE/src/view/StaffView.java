package view;

public class StaffView {
    private static final StaffView staffView = new StaffView();
    private StaffView() {}
    public static StaffView getInstance() {
        return staffView;
    }
    public void displayStaffView() {
        System.out.println("-----RENTAL CAR MANAGEMENT-----");
        System.out.println("1. Add car");
        System.out.println("2. Delete car");
        System.out.println("3. tình trạng xe");
        System.out.println("4. tạo đơn giao xe tới điểm thuê");
        System.out.println("5. Xác nhận tình trạng xe khi cho thuê");
        System.out.println("6. Thanh toán");
        System.out.println("0. Exit");
    }
}
