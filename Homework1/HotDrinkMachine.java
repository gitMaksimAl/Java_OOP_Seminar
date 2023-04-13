package Homework1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkMachine implements VendingMachine {
    private List<HotDrink> drinks = new ArrayList<>();

    @Override
    public void addProduct(Drink item) {
        if (item instanceof HotDrink) drinks.add((HotDrink)item);
    }

    @Override
    public Drink getProduct(String name) {
        return this.getProduct(name, 0, 0);
    }

    // Method overload
    public HotDrink getProduct(String name, double coast, int temp) {
        for (HotDrink item: drinks) {
            if (
                item.getName().equals(name)
                && item.getCoast() == coast
                && item.getTemperature() == temp
            ) return item;
        }
        return null;
    }
}
