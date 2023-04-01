package Lesson_1;

public class BarMachine implements VendingMachine {

    @Override
    public Product getProductByName(String name) {
        for (Product item: products)
            if (item.getName().equals(name)) return item;
        return null;
    }

    @Override
    public Product getProductByCoast(double coast) {
        for (Product item: products)
            if (item.getCoast() == coast) return item;
        return null;
    }

    @Override
    public void dropProduct(Product item) {
        if (item instanceof Bar) products.add(item);
    }
}
