package Homework1;

/**
 * Interface that describe the operation of the vending machine.
 */
public interface VendingMachine {
    public Drink getProduct(String name);

    public void addProduct(Drink item);
}
