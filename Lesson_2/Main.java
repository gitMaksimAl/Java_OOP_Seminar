package Lesson_2;

public class Main {

    public static void main(String[] args) {
        // System.out.print("\033[H\033[2J");
        Human man = new Human();
        man.setName("Boris");
        // man.setMakeOrder();
        //  man.setTakeOrder();
        //  System.out.printf("%s: ", man.getName());
        //  System.out.println(man.isTakeOrder ? "Take it": "Not yet.");

        Market univermag = new Market();
        univermag.acceptToMarket(man);
        univermag.takeInQueue(man);
        univermag.takeOrders();
        univermag.showClients();
        univermag.giveOrders();
        if (man.isTakeOrder) {
            univermag.releaseFromQueue();
            univermag.releaseFromMarket(man);
        }
    }
}
