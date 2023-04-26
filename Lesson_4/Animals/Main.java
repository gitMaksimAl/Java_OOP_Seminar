package Lesson_4.Animals;

public class Main {
    public static void main(String[] args) {
        Animal<Cat> catAnimal = new Animal<>();
        Animal dogAnimal = new Animal<>();
        catAnimal.setAnimal(new Cat("Murzik", 1, 2));
        dogAnimal.setAnimal(new Dog("Sharik", 1, 5));
        System.out.println(dogAnimal.getAnimal());
        System.out.println(catAnimal.getAnimal());
    }
}
