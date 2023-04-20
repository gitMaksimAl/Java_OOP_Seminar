package Homework_6.Tank;

import Homework_6.Eat;
import Homework_6.Product;

/**
 * Дочерний класс - SolidTank - реализует методы работы с твердыми продуктами.
 * Хранит продукты поштучно.
 */
public class SolidTank extends Tank<Eat>{
    private int capacity;
    private int currentCapacity;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public Product emptyTank(Eat product) {
        if (container.isEmpty())
            throw new UnsupportedOperationException();
        else {
            currentCapacity--;
            return container.get(0);
        }
    }

    public void fillTank(Eat product) {
        if (currentCapacity < capacity) {
            container.add(product);
            currentCapacity++;
        } else System.out.println("Tank is full.");
    }

    void fillTank(Eat product, int amount) {
        if (currentCapacity + amount < capacity) {
            container.add(product);
            currentCapacity += amount;
        } else System.err.println("Tank is full.");
    }

    @Override
    public String toString() {
        return String.format("Tank{product='%s', capacity='%dpieces'}",
            super.toString(),
            getCapacity()
        );
    }
}
