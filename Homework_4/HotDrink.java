package Homework_4;

public class HotDrink extends Drink {
    private int temperature;

    public HotDrink(String name, double coast, int temp) {
        super(name, coast);
        this.temperature = temp;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("%s %s", (this.temperature > 81) ? "Hot": "Cold", super.toString());
    }
}
