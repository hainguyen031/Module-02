package service;

import entity.Staff;
import entity.User;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static UserService userService = new UserService();
    static List<User> userList;

    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private UserService() {
        userList = new ArrayList<>();
        userList.add(Staff.getInstance());
    }

    public static UserService getInstance() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void addNewUser(User newUser) {
        userList.add(newUser);
    }

//    public static boolean register(User user) {
//        for(User ele: userList) {
//            if (ele.getUsername().equals(user.getUsername())) {
//                System.out.println("Account already exists");
//                return false;
//            }
//        }
//        userList.add(user);
//        return true;
//    }
//
//    public static boolean login(String username, String password) {
//        for (User ele : userList) {
//            if (ele.getUsername().equals(username) && ele.getPassword().equals(password)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
