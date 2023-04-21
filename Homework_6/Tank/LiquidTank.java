package Homework_6.Tank;

import Homework_6.Drink;
/**
 * Дочерний класс - LiquidTank - реализует методы работы с емкостью содержащей
 * жидкие продукты. Хранит продукты в литрах.
 */
public class LiquidTank extends Tank<Drink>{
    private float capacity;
    private float currentCapacity;

    public LiquidTank(float capacity) {
        this.capacity = capacity;
        this.currentCapacity = 0;
    }

    public float getCapacity() {
        return capacity;
    }

    public  Drink emptyTank(int index) {
        if (container.isEmpty())
            throw new UnsupportedOperationException("Empty container.");
        else {
            Drink product = container.get(index);
            container.remove(index);
            currentCapacity -= product.getVolume();
            return product;
        }
    }

    public void fillTank(Drink product) {
        if (currentCapacity + product.getVolume() <= capacity) {
            container.add(product);
            currentCapacity += product.getVolume();
        } else System.err.println("Tank is full.");
    }

    @Override
    public String toString() {
        return String.format("Tank{product='%s', capacity='%.2fLiters', currentCapacity='%.2f'}",
            super.toString(),
            getCapacity(),
            this.currentCapacity
        );
    }
}
