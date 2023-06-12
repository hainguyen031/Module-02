package entity;

import service.UserService;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class User {
    static Scanner scanner = new Scanner(System.in);
    private static int idCount = 0;
    private int id;
    private String username;
    private String password;
    public User() {
        idCount++;
        this.id = idCount;
    }
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public void register() {
        System.out.println("REGISTER");
        System.out.println("Input username: ");
        username = scanner.nextLine();
        System.out.println("Input password: ");
        password = scanner.nextLine();
        User user = new User(username, password);
        boolean success = UserService.register(user);
        if (success) {
            System.out.println("Register successful");
        } else {
            System.out.println("Register failed");
        }
    }
    public void login() {
        System.out.println("LOGIN");
        System.out.println("Input username:");
        username = scanner.nextLine();
        System.out.println("Input password: ");
        password = scanner.nextLine();
        boolean success = UserService.login(username, password);
        if (success) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
