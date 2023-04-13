package Lesson_5.Service;

import Lesson_5.Model.User;
import Lesson_5.Repository.UserRepository;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepository();

    public void saveUser(User user) {
        if (user == null) userRepository.saveUser(user);
        System.out.println("null user, can`t save");
    }
}
