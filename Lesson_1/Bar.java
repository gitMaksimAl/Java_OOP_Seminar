package Lesson_1;

public class Bar extends Product{
    private int kCal;

    public Bar(String name, double coast, int calories) {
        super(name, coast);
        this.kCal = calories;
    }

    public int getKCalories() {
        return kCal;
    }

    @Override
    public String toString() {
        return String.format("%s...%dckal\t\t=%.2f", getName(), getKCalories(), getCoast());
    }
}
