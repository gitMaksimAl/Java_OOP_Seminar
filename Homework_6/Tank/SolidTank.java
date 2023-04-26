package Homework_6.Tank;

import Homework_6.Eat;

/**
 * Дочерний класс - SolidTank - реализует методы работы с твердыми продуктами.
 * Хранит продукты поштучно.
 */
public class SolidTank extends Tank<Eat>{
    private int capacity;
    private int currentCapacity;

    public SolidTank(int capacity) {
        this.capacity = capacity;
        this.currentCapacity = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public Eat emptyTank(int index) {
        if (container.isEmpty())
            throw new UnsupportedOperationException("Empty container.");
        else {
            Eat product = container.get(index);
            container.remove(index);
            currentCapacity--;
            return product;
        }
    }

    public void fillTank(Eat product) {
        if (currentCapacity < capacity) {
            container.add(product);
            currentCapacity++;
        } else System.out.println("Tank is full.");
    }

    public void fillTank(Eat product, int amount) {
        if (currentCapacity + amount < capacity) {
            container.add(product);
            currentCapacity += amount;
        } else System.err.println("Tank is full.");
    }

    @Override
    public String toString() {
        return String.format("Tank{product='%s', capacity='%dpieces, currentCapacity='%d'}",
            super.toString(),
            getCapacity(),
            this.currentCapacity
        );
    }
}
