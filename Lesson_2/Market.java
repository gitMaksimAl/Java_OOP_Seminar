package Lesson_2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Actor> actors;
    private Queue<Actor> queue;

    public Market() {
        this.actors = new ArrayList<>();
        this.queue = new ArrayDeque<>();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.printf("%s stand in queue.\n", actor.getName());
    }

    @Override
    public void takeOrders() {
        Actor next = queue.peek();
        if (next instanceof Human) ((Human)next).setMakeOrder();
        System.out.printf("%s`s order is ready.\n", next.getName());
    }

    @Override
    public void giveOrders() {
        Actor next = queue.peek();
        if (next instanceof Human) ((Human)next).setTakeOrder();
        System.out.printf("%s take our order\n", next.getName());
    }

    @Override
    public void releaseFromQueue() {
        if (queue.peek().isTakeOrder) queue.poll();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        actors.add(actor);
    }

    @Override
    public void releaseFromMarket(Actor actor) {
        actors.remove(actor);
        System.out.printf("%s leave the mag.\n", actor.getName());
    }

    @Override
    public void update(Actor actor) {
        
    }

    public void showClients() {
        for (Actor client: actors) System.out.printf("%s ", client.getName());
        System.out.println("in room.");;
    }
    
}
