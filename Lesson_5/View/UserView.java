package Lesson_5.View;

import java.util.Scanner;

import Lesson_5.Controller.UserController;

public class UserView {
    public static void main(String[] args) {
        UserController controller = new UserController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter data.");
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        controller.saveUser(name, Integer.parseInt(age));
        name = scanner.nextLine();
        age = scanner.nextLine();
        controller.saveUser(name, Integer.parseInt(age));
        name = scanner.nextLine();
        age = scanner.nextLine();
        controller.saveUser(name, Integer.parseInt(age));
        System.out.println(controller.getUsersInfo());

        System.out.println("Please enter number of user to update and data.");
        controller.updateUser(Integer.parseInt(scanner.nextLine()), scanner.nextLine(), scanner.nextInt());
        System.out.println(controller.getUsersInfo());
    }
}
