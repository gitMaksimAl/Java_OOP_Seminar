package Homework_2;

import java.util.Scanner;

public class Calculator {
    private Operand a;
    private double b;
    private Scanner scanner;
    private String input;

    public Calculator() {
        scanner = new Scanner(System.in);
        a = new Operand(scanner.nextLine());
    }

    public void setB() {
        input = scanner.nextLine();
        try {
            this.b = Double.parseDouble(input);
        } catch (Exception e) {
            System.err.println("Can`t parse line set to 0.");
            this.b = 0;
        }
    }

    public void run() {
        switch (scanner.nextLine()) {
            case "+":
                setB();
                System.out.println(a.add(b));
                break;
            case "-":
                setB();
                System.out.println(a.sub(b));
                break;
            case "*":
                setB();
                System.out.println(a.mult(b));
                break;
            case "/":
                setB();
                System.out.println(a.div(b));
                break;
            default:
                break;
        }
        scanner.close();
    }
}
