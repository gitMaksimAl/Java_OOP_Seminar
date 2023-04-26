package Lesson_4.task2;

/**
 * Chips
 */
public class Chips extends Product {

    private String taste;
    private double coast;

    public Chips(String name, double cost, String taste) {
        super(name, cost);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return String.format("%s chips for %.2f", getTaste(), getCoast());
    }
}
