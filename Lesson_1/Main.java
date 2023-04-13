package Lesson_1;

public class Main {
    public static void main(String[] args) {
        BottleMachine box1 = new BottleMachine();
        BarMachine box2 = new BarMachine();

        box1.dropProduct(new Bottle("Coca-Cola", 5.95f, 0.5f));
        box1.dropProduct(new Bottle("Moloko", 7.57f, 1.0f));
        box1.dropProduct(new Bottle("Baikal", 3.15f, 0.3f));

        box2.dropProduct(new Bar("Snikers", 4.5f, 75));
        box2.dropProduct(new Bar("Alenka", 6.12f, 54));
        box2.dropProduct(new Bar("Mars", 9.1f, 101));
    
        for (Product item: VendingMachine.products) System.out.println(item.toString());
        System.out.println(VendingMachine.products.toString());
    }
}
