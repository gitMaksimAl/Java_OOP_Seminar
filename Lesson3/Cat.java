package Lesson3;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Cat named %s", name);
    }
}
