package Homework_6.Tank;

import java.util.ArrayList;
import java.util.List;

import Homework_6.Product;
/**
 * Абстрактный класс - емкость - не зависит от типов содержимых в нем продуктов.
 */
public class Tank<T extends Product> {
    protected  List<T> container = new ArrayList<>();

    public Product emptyTank(T product) {
        return container.get(0);
    }

    public void fillTank(T product) {
        container.add(product);
    }

    public List<T> getProducts() {
        return container;
    }

    @Override
    public String toString() {
        return container.toString();
    }
}
