package Lesson_1;

public class Bottle extends Product {
    private double volume;

    public Bottle(String name, double coast, double volume) {
        super(name, coast);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("%s...%.2fLiters\t\t=%.2f", getName(), getCoast(), getVolume());
    }
}
