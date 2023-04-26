package Homework_6;

/**
 * Класс DeliveryWindow - выполняет одну задачу: выдача продукта.
 */
public class DeliveryWindow {

    public static void giveProduct(Product product) {
        int packageSize = product.getName().length() * 7;
        for (int i = 0; i < packageSize; i++)
            System.out.print('-');
        System.out.printf("\n| %s |\n", product);
        for (int i = 0; i < packageSize; i++)
            System.out.print('-');
        System.out.println();
    }

}