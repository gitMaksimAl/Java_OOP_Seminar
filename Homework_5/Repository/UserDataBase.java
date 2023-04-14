package Homework_5.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import Homework_5.Model.User;

public class UserDataBase {
    private List<User> db = new ArrayList<>();

    public void addUser(User user) {
        db.add(user);
    }

    public boolean delUser(User user) {
        if (user.getBalance() != 0) {
            System.err.println("not null balance.");
            return false;
        } else {
            db.remove(user);
            user = null;
            System.gc();
            return true;
        }
    }

    public String getInfo() {
        return db.toString();
    }

    public User getUser(String name, String lastName) {
        for (User item: db)
            if (item.getName().equals(name)
            && item.getLastName().equals(lastName)
        ) return item;
        throw new NoSuchElementException();
    }

    public boolean userExist(User user) {
        return db.contains(user);
    }
}
