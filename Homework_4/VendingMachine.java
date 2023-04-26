package Homework_4;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that implement the operation of the vending machine.
 */
public class VendingMachine<T extends Product> {
    private List<T> products;

    public VendingMachine() {
        this.products = new ArrayList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }
}
