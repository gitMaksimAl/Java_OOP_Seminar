package Lesson_6.Task2;

public class CatBuilder {
    private static CatBuilder instance = null;
    public Cat cat;

    public CatBuilder() {

    }

    public static CatBuilder getInstance() {
        if (instance == null) instance = new CatBuilder();
        instance.cat = new Cat();
        return instance;
    }

    public CatBuilder setName(String name) {
        this.cat.setName(name);
        return this;
    }

    public CatBuilder setAge(int age) {
        this.cat.setAge(age);
        return this;
    }

    public CatBuilder setColor(String color) {
        this.cat.setColor(color);
        return this;
    }

    public CatBuilder setMood(boolean mood) {
        this.cat.setInGoodMood(mood);
        return this;
    }

    public CatBuilder setWeigth(int weght) {
        this.cat.setWeight(weght);
        return this;
    }

    public CatBuilder setBreed(String breed) {
        this.cat.setBreed(breed);
        return this;
    }

    public Cat build() {
        return this.cat;
    }
}
