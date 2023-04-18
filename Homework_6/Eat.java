package Homework_6;

public class Eat extends Product {
    private float weight;

    public Eat(String name, float coast, float weight) {
        this.name = name;
        this.coast = coast;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getCoast() {
        return coast;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%.2f kg of %s for %.2f\u20BD",
            getWeight(),
            getName(),
            getCoast()
        );
    }
}
