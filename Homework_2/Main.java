package Homework_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Operand a = new Operand(Double.parseDouble(input));
        switch (scanner.nextLine()) {
            case "+":
                input = scanner.nextLine();
                System.out.println(a.add(Double.parseDouble(input)));
                break;
            case "-":
                input = scanner.nextLine();
                System.out.println(a.sub(Double.parseDouble(input)));
                break;
            case "*":
                input = scanner.nextLine();
                System.out.println(a.mult(Double.parseDouble(input)));
                break;
            case "/":
                input = scanner.nextLine();
                System.out.println(a.div(Double.parseDouble(input)));
                break;
            default:
                break;
        }
        scanner.close();
    }
}
