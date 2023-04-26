package Homework_6;


import java.util.List;

import Homework_6.ControlPanel.Acceptor;
import Homework_6.ControlPanel.Panel;
import Homework_6.Tank.Tank;

public class Controller<T extends Product> {
    private Tank<T> tank;
    public Panel panel;
    public Acceptor acceptor;
    private Product product;
    private float bank;

    public Controller(Tank<T> tank) {
        this.tank = tank;
        this.panel = new Panel();
        this.acceptor = new Acceptor();
        this.bank = 0;
    }

    public void initPanel() {
        List<T> list = this.tank.getProducts();
        int num = 1;
        this.panel.resetButtons();
        for (T item : list) {
            if (item instanceof Product) this.panel.addButton(item, num);
            num++;
        }
    }
    private boolean acceptPayment() {
        return (acceptor.getDeposit() - this.product.getCoast()) >= 0;
    }

    public void addProduct(T product) {
        this.tank.fillTank(product);
        initPanel();
    }

    public void pushProduct(int index) {
        try {
            this.product = (Product)this.tank.emptyTank(index);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        if (acceptPayment()) {
            bank += product.getCoast();
            DeliveryWindow.giveProduct(this.product);
            initPanel();
            product = null;
            acceptor.resetDeposit();
        } else {
            System.err.println("Not accept payment or product");
            acceptor.resetDeposit();
            product = null;
        }
    }

    public float getBank() {
        return bank;
    }

    public int productRequest(int button) {
        if (panel.pushButton(button)) return button - 1;
        else throw new ArrayIndexOutOfBoundsException("Have not this button.");
    }

    public void diagnostic() {
        System.err.printf("\nDIAGNOSTIC\n%s---%s---%s---%s---%s\n\n",
            this.tank.toString(),
            this.acceptor.toString(),
            this.panel.toString(),
            this.product,
            this.bank
        );
    }
}
