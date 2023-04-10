package Lesson_4.Animals;

public class Cat extends BasicAnimal{
    private String name;
    private int age;
    private float weight;

    public Cat(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Cat %s, %d y.o.", getName(), getAge());
    }
}
