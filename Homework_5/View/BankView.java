package Homework_5.View;

import java.util.Scanner;
import Homework_5.Controller.BankController;
import Homework_5.Model.User;

/**
 * Description
 *  Implements of online bank application.
 * Bugs
 *  Garbage collector not remove link on user.
 *  Need logout/login to make it work.
 */
public class BankView {
    BankController controller = new BankController();
    private Scanner scanner;
    private User user;

    public void printMenu() {
        System.out.println("1)LogIn\t2)addUser\t3)delUser\n" +
            "4)addMoney\t5)takeMoney\t6)exit");
    }

    public void dataRequest() {
        System.out.println("Please enter your name and last name.");
    }

    public void passwordRequest() {
        System.out.println("Please enter password.");
    }

    public int moneyAmount(String input) {
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            return 0;
        }
    }

    public void run() {
        this.scanner = new Scanner(System.in);
        String name;
        String lastName;
        String passwd = null;
        printMenu();
        String choice = scanner.nextLine();
        while (!(choice.equals("6"))) {
            switch (choice) {
                case "1":
                    dataRequest();
                    name = scanner.nextLine();
                    lastName = scanner.nextLine();
                    passwordRequest();
                    passwd = scanner.nextLine();
                    try {
                        this.user = controller.authorization(name, lastName);
                        if (!(controller.validate(this.user, passwd)))
                            System.out.println("Wrong password.");
                        passwd = null;
                    } catch (Exception e) {
                        System.out.println("Wrong login.");
                        this.user = null;
                        passwd = null;
                    }
                    printMenu();
                    choice = scanner.nextLine();
                    break;
                case "2":
                    dataRequest();
                    name = scanner.nextLine();
                    lastName = scanner.nextLine();
                    passwordRequest();
                    passwd = scanner.nextLine();
                    this.user = new User(name, lastName, passwd);
                    if (!(controller.addAccount(this.user)))
                        System.out.println("Can`t create this account.");
                    passwd = null;
                    printMenu();
                    choice = scanner.nextLine();
                    break;
                case "3":
                    passwordRequest();
                    passwd = scanner.nextLine();
                    if (!(controller.delAccount(this.user, passwd)))
                        System.out.println("Check your login and balance.");
                    else System.out.println("account deleted.");
                    passwd = null;
                    printMenu();
                    choice = scanner.nextLine();
                    break;
                case "4":
                    passwordRequest();
                    passwd = scanner.nextLine();
                    System.out.println("Enter cash.");
                    if (!(controller.addMoney(this.user, passwd, moneyAmount(scanner.nextLine())))
                    ) System.out.println("Check your login and password.");
                    passwd = null;
                    printMenu();
                    choice = scanner.nextLine();
                    break;
                case "5":
                    passwordRequest();
                    passwd = scanner.nextLine();
                    System.out.println("Enter cash.");
                    if (!(controller.takeMoney(this.user, passwd, moneyAmount(scanner.nextLine())))
                    ) System.out.println("Check your login and password.");
                    passwd = null;
                    printMenu();
                    choice = scanner.nextLine();
                    break;
                default:
                    passwordRequest();
                    System.out.println(controller.getInfo(user, scanner.nextLine()));
                    System.out.println("\n--------Bank Online--------\n");
                    printMenu();
                    choice = scanner.nextLine();
                    break;
            }
        }
        scanner.close();
    }
}
