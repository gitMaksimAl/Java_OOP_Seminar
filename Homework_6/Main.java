package Homework_6;

import Homework_6.Tank.LiquidTank;
import Homework_6.Tank.SolidTank;

/**
*Взять реализованный код в рамках семинара 4 и продемонстрировать применение
* принципов, усвоенных на семинаре. Нужно в проекте прокомментировать участки
* кода, которые рефакторим, какой принцип применяем и почему 
*/

public class Main {
    public static void main(String[] args) {
        Controller<Eat> eatMachine = new Controller<>(new SolidTank(12));
        eatMachine.addProduct(new Eat("Mars", 9.99f, 0.08f));
        eatMachine.addProduct(new Eat("Snikers", 8.5f, 0.08f));
    
        Controller<Drink> drinkMachine = new Controller<>(new LiquidTank(12.0f));
        drinkMachine.addProduct(new Drink("Coffee", 7.50f, 0.3f));
        drinkMachine.addProduct(new Drink("Moloko", 8.50f, 0.5f));
        drinkMachine.addProduct(new Drink("Vodka", 3.50f, 0.5f));


        //View UI = new View();
        //UI.run(eatMachine);

        View UI2 = new View();
        UI2.run(drinkMachine);
    }
}
