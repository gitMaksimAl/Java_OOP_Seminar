package Lesson_1.Animals;

public class Capybara extends Animal implements AnimalInterface {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Hi i`m Capybara");
        
    }

    @Override
    public void sayWithInterface() {
        System.out.println("I1m animal");
    }
}
