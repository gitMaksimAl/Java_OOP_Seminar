package Lesson_5.Controller;

import Lesson_5.Model.User;
import Lesson_5.Service.UserService;
import Lesson_5.Service.UserServiceImpl;

public class UserController {
    private UserService userService = new UserServiceImpl();

    public void saveUser(String name, int age) {
        userService.saveUser(new User(name, age));
    }
}
