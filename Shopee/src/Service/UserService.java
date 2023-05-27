package Service;

import Entity.User;

public interface UserService {
    boolean register(User user);

    boolean login(String username, String password);

    void logout();

    User viewCurrentUser();
}
