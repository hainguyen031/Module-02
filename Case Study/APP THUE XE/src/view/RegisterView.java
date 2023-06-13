package view;

import entity.User;
import service.InputService;
import service.UserService;

import java.time.format.DateTimeFormatter;

public class RegisterView {
    private static final RegisterView registerView = new RegisterView();
    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private RegisterView() {
    }

    public static RegisterView getInstance() {
        return registerView;
    }

    public void displayRegisterMenu() {
        System.out.println("-----REGISTER-----");
        String username = InputService.getInstance().inputInfo("username");
        String email = "";
        boolean isExist = true;
        while (isExist) {
            isExist = false;
            email = InputService.getInstance().inputInfo("email");
            for (User user : UserService.getInstance().getUserList()) {
                if (email.equals(user.getEmail())) {
                    System.out.println("Email has been used. Try with another one");
                    isExist = true;
                }
            }
        }
        String phone = InputService.getInstance().inputInfo("phone");
        String password = InputService.getInstance().inputInfo("password");
        User newUser = new User(password, username, phone, email);
        UserService.getInstance().addNewUser(newUser);

    }
}
