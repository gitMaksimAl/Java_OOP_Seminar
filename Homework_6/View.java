package Homework_6;

import java.util.Scanner;

public class View {
    Scanner scanner;

    public View() {
        this.scanner = new Scanner(System.in);
    }

    public void run(Controller<? extends Product> controller) {
        System.out.println(controller.panel.getButtons());
        String input = scanner.nextLine();
        while (!(input.equals(""))) {
            try {
                int button = Integer.parseInt(input);
                // productRequest return index, not button
                button = controller.productRequest(button);
                System.out.println("Enter bills...");
                controller.acceptor.getBill(Integer.parseInt(scanner.nextLine()));
                System.out.println("Enter coins...");
                controller.acceptor.getCoin(Integer.parseInt(scanner.nextLine()));
                controller.pushProduct(button);
            } catch (Exception e) {
                controller.diagnostic();
                System.err.println(e.getMessage());
            }
            System.out.println(controller.panel.getButtons());
            input = scanner.nextLine();
        }
        scanner.close();
    }
}
