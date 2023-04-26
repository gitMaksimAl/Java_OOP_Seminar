package Homework_5.Service;

import Homework_5.Model.User;

public interface UserService {
    boolean addUser(User user);
    boolean delUser(User user);
    User getUser(String name, String lastName);
}
