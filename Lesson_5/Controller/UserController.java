package Lesson_5.Controller;


import Lesson_5.Model.User;
import Lesson_5.Service.UserServiceImpl;

public class UserController {
    private UserServiceImpl userService = new UserServiceImpl();

    public void saveUser(String name, int age) {
        userService.addUser(new User(name, age));
    }

    public void updateUser(int index, String name, int age) {
        User target = userService.getUser(index);
        target.setName(name);
        target.setAge(age);
    }

    public String getUsersInfo(){
        return userService.getUsers();
    }
}
