package Homework_6;


import Homework_6.ControlPanel.Acceptor;
import Homework_6.ControlPanel.Panel;
import Homework_6.Tank.SolidTank;
import Homework_6.Tank.Tank;

public class Controller<T extends Product> {
    private Tank<T> tank;
    private Panel<T> panel;
    private Acceptor acceptor;
    private Product product;
    private float bank;

    public Controller() {
        this.bank = 0;
    }

    private boolean acceptPayment() {
        return (acceptor.getDeposit() - product.getCoast()) >= 0;
    }

    public void setTank(Tank<T> tank) {
        this.tank = tank;
    }

    public void setPanel(Panel<T> panel) {
        this.panel = panel;
    }

    public void setAcceptor(Acceptor acceptor) {
        this.acceptor = acceptor;
    }

    public void pushProduct(T item) {
        if (acceptPayment() && product != null) {
            try {
                this.product = tank.emptyTank(item);
                bank += product.getCoast();
                DeliveryWindow.giveProduct(item);
                product = null;
                acceptor.resetDeposit();
            } catch (Exception e) {
                System.err.println("Machines container is empty.");
            }
        } else {
            acceptor.resetDeposit();
            product = null;
        }
    }

    public float getBank() {
        return bank;
    }

    public void productRequest(int index) {
        String name = panel.pushButton(index);
        for (Product item: tank.getProducts())
            if (item.getName().equals(name))
                this.product = item;
    }

    static class Builder {
    
        private static Builder builder = null;
        private Controller<? super Product> controller;
    
        private static Builder getInstance() {
            if (builder == null) builder = new Builder();
            builder.controller = new Controller<>();
            return builder;
        }

        public void setSolidTank() {this.controller.tank = new SolidTank();}
    }
}
