package Lesson_4.task2;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        VendingMachine<Chips> box1 = new VendingMachine<>();
        box1.addProduct(new Chips("Kartoshkin", 12, "Fish"));
        box1.addProduct(new Chips("Kartoshkin", 11.5, "Crabs"));
        box1.addProduct(new Chips("Cheetos", 12, "Coca"));

        System.out.println(box1.getProducts());
    }
}