package Lesson_6.Task2;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private int weight;
    private boolean isInGoodMood;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setInGoodMood(boolean isInGoodMood) {
        this.isInGoodMood = isInGoodMood;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getMood() {
        return String.format("%s", (isInGoodMood) ? "true": "false");
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Cat{name='%s', age='%d', color='%s', inGoodMood='%s'}",
            getName(), getAge(), getColor(), getMood()
        );
    }
}
