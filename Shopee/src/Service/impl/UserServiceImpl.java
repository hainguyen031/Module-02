package Service.impl;

import Entity.User;
import Service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    static List<User> userList = new ArrayList<User>();
    static User currentUser;
    @Override
    public boolean register(User user) {
        userList.add(user);
        return true;
    }

    @Override
    public boolean login(String username, String password) {
        for (User element : userList) {
            if (element.getUsername().equals(username) &&
                element.getPassword().equals(password)) {
                currentUser = element;
                return true;
            }
        }
        return false;
    }

    @Override
    public void logout() {
        currentUser = null;
        System.out.println("Log out");
    }

    @Override
    public User viewCurrentUser() {
        return currentUser;
    }

}


