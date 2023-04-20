package Homework_6;

import java.util.ResourceBundle.Control;

import Homework_6.ControlPanel.Acceptor;
import Homework_6.ControlPanel.Panel;
import Homework_6.Tank.SolidTank;
import Homework_6.Tank.Tank;

/**
 * Собирает автомат определенных продуктов по модулям.
 */
public class VendingMachineBuilder<T extends Product> {
    private  static VendingMachineBuilder<? extends Product> instance = null;
    Controller<? extends Product> controller;

    public static VendingMachineBuilder<Eat> getInstnance() {
        if (instance == null) instance = (VendingMachineBuilder<Eat>)instance;
        instance.controller = new Controller<Eat>();
        return instance;
    }

    public Controller<T> build() {
        return this.controller;
    }
}
