package Lesson_5.Service;

import Lesson_5.Model.User;

public interface UserService {
    void addUser(User user);
    void delUser(User user);
    User getUser(int index);
    String getUsers();
}
