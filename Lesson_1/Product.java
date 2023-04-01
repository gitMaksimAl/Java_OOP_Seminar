package Lesson_1;

/**
 * Product
 */
public abstract class Product {
    private String name;
    private double coast;

    public Product(String name, double coast) {
        this.name = name;
        this.coast = coast;
    }

    public String getName() {
        return this.name;
    }

    public double getCoast() {
        return this.coast;
    }

    public String toString() {
        return String.format("%s\t\t=%f", name, coast);
    }
}
