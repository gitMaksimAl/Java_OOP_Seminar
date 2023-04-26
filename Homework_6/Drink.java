package Homework_6;

/**
 * Class that does not fully implements drinks.
 */
public class Drink extends Product {
    private float volume;

    public Drink(String name, float coast, float volume) {
        this.name = name;
        this.coast = coast;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public float getCoast() {
        return coast;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return String.format("%.2f liters of %s for %.2f\u20BD",
            getVolume(),
            getName(),
            getCoast()
        );
    }
}
