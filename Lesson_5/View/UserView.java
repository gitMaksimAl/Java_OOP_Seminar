package Lesson_5.View;

import java.util.Scanner;

import Lesson_5.Controller.UserController;

public class UserView {
    public static void main(String[] args) {
        UserController controller = new UserController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter data.");
        controller.saveUser(scanner.nextLine(), scanner.nextInt());
    }
}
