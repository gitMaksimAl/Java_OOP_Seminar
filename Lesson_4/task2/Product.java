package Lesson_4.task2;

/**
 * изменить стоимость по продукту
 */
public abstract class Product {
    private String name;
    private double coast;

    public Product(String name, double cost) {
        this.name = name;
        this.coast = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double cost) {
        this.coast = cost;
    }

    @Override
    public String toString() {
        return String.format("%s price: %2f", getName(), getCoast());
    }
}
