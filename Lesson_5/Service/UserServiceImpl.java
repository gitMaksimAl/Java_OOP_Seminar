package Lesson_5.Service;

import Lesson_5.Model.User;
import Lesson_5.Repository.UserRepository;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepository();

    public void addUser(User user) {
        if (user != null) userRepository.saveUser(user);
        else System.out.println("null user, can`t save");
    }

    public void delUser(User user) {
        if (user != null) userRepository.delUser(user);
        else System.out.println("user not exist.");
    }

    public User getUser(int index) {
        return userRepository.getUser(index);
    }

    public String getUsers() {
        return userRepository.getInfo();
    }
}
