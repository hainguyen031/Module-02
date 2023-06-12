package service;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    static List<User> userList = new ArrayList<>();
    static User currentUser;
    public static boolean register(User user) {
        for(User ele: userList) {
            if (ele.getUsername().equals(user.getUsername())) {
                System.out.println("Account already exists");
                return false;
            }
        }
        userList.add(user);
        return true;
    }

    public static boolean login(String username, String password) {
        for (User ele : userList) {
            if (ele.getUsername().equals(username) && ele.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
