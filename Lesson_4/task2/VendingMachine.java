package Lesson_4.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * добавить в список продуктов
 * получать и удалять
 * должен быть отдельный класс для всех
 */
public class VendingMachine<T extends Product> {
    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        this.products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }

    public void delProduct(T product) {
        products.remove(product);
    }
}
