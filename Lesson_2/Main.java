package Lesson_2;

public class Main {

    public static void main(String[] args) {
        Human man = new Human();
        man.setName("Boris");
        // man.setMakeOrder();
        man.setTakeOrder();
        System.out.printf("\033[H\033[2J%s: ", man.getName());
        System.out.println(man.isTakeOrder ? "Take it": "Not yet.");
    }
}
