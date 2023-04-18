package Homework_6;

/**
* Необходимо взять код из первого дз и переработать его с учетом обобщений т.е 
* избавиться от классов под каждый тип продукта, заменив единым классом -
* торговым автоматом
*/

public class Main {
    public static void main(String[] args) {
        VendingMachine<Drink> drinker = new VendingMachine<>();
        drinker.addProduct(new Drink("Cola", 9.99f, 0.5f));
        drinker.addProduct(new Drink("Vodka", 5.74f, 0.5f));
        drinker.addProduct(new Drink("EnergyDrink", 12.6f, 0.3f));

        VendingMachine<Eat> eater = new VendingMachine<>();
        eater.addProduct(new Eat("Pechenka", 2.33f, 0.1f));
        eater.addProduct(new Eat("Bar", 4.12f, 0.08f));
        eater.addProduct(new Eat("Fish", 7.83f, 1.3f));
        eater.addProduct(new Eat("Meat", 12.1f, 1.0f));

        System.out.println(drinker.getProducts());
        System.out.println(eater.getProducts());
    }
}
