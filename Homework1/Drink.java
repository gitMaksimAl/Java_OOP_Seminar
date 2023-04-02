package Homework1;

public abstract class Drink {
    private String name;
    private double coast;

    public Drink(String name, double coast) {
        this.name = name;
        this.coast = coast;
    }

    public String getName() {
        return name;
    }

    public double getCoast() {
        return coast;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t=%.2f", name, coast);
    }
}
