package Lesson_5.Repository;

import java.util.ArrayList;
import java.util.List;

import Lesson_5.Model.User;

public class UserRepository {
    private List<User> users = new ArrayList<>();
    public void saveUser(User user) {
        users.add(user);
    }

    public void delUser(User user) {
        users.remove(user);
    }

    public User getUser(int index) {
        return users.get(index);
    }

    public String getInfo() {
        return users.toString();
    }
}
