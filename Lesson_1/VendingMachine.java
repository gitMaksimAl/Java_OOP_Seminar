package Lesson_1;

import java.util.ArrayList;
import java.util.List;

// Сделать класс Товар абстрактным, создать нескольких наследников (к примеру:
// БутылкаВоды), сделать интерфейсом ТорговыйАвтомат и реализовать класс
// какого-то одного типа ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат

public interface VendingMachine {
    public static List<Product> products = new ArrayList<>();

    public Product getProductByName(String name);

    public Product getProductByCoast(double coast);

    public void dropProduct(Product item);
}
