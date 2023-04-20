package Homework_6.Tank;

import Homework_6.Drink;
/**
 * Дочерний класс - LiquidTank - реализует методы работы с емкостью содержащей
 * жидкие продукты. Хранит продукты в литрах.
 */
public class LiquidTank extends Tank<Drink>{
    private float capacity;
    private float currentCapacity;

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getCapacity() {
        return capacity;
    }

    public  Drink emptyTank(Drink product) {
        if (container.isEmpty())
            throw new UnsupportedOperationException();
        else {
            currentCapacity -= product.getVolume();
            return container.get(0);
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
        return String.format("Tank{product='%s', capacity='%.2fLiters'}",
            super.toString(),
            getCapacity()
        );
    }
}
