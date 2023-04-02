package Homework1;

/**
* Создать наследника реализованного класса ГорячийНапиток с дополнительным
* полем int температура.
* Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
* реализовать перегруженный метод getProduct(int name, int volume, int
* temperature) выдающий продукт соответствующий имени, объему и температуре
* В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
* и воспроизвести логику заложенную в программе
* Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
*/

public class Main {
    public static void main(String[] args) {
        HotDrinkMachine coffeeBox = new HotDrinkMachine();
        HotDrinkMachine teaBox = new HotDrinkMachine();
        HotDrink one = new HotDrink("Tea Black", 7.77, 85);

        coffeeBox.addProduct(new HotDrink("Coffee Mocha", 9.99, 30));
        coffeeBox.addProduct(new HotDrink("Coffee Latte", 13.0, 83));
        coffeeBox.addProduct(new HotDrink("Coffee Americano", 11.5, 79));

        teaBox.addProduct(new HotDrink("Moloko", 5.75, 50));
        teaBox.addProduct(new HotDrink("Tea Green", 5.75, 68));
        teaBox.addProduct(one);

        System.out.println(coffeeBox.getProduct("Coffee Latte").toString());
    }
}
