package Homework_6.Tank;

import java.util.ArrayList;
import java.util.List;

import Homework_6.Product;
/**
 * Класс - емкость - не зависит от типов содержимых в нем продуктов.
 */
public abstract class Tank<T extends Product> {
    protected  List<T> container = new ArrayList<>();

    abstract public Product emptyTank(int index);

    abstract public void fillTank(T product);

    public List<T> getProducts() {
        return container;
    }

    @Override
    public String toString() {
        return container.toString();
    }
}
