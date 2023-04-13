package Lesson_5.Repository;

import java.io.FileWriter;

import Lesson_5.Model.User;

public class UserRepository {
    public void saveUser(User user) {
        try(FileWriter writer = new FileWriter("user.txt", true)) {
            writer.write(user.toString());
        } catch (Exception e) {
            System.out.println("err in repo");
        }
    }
}
