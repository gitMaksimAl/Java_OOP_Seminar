package Lesson_2;

public class Human extends Actor implements ActorBehaviour {
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void setMakeOrder() {
        this.isMakeOrder = true;
    }

    @Override
    /**
     * setter
     */
    public void setTakeOrder() {
        if (this.isMakeOrder) this.isTakeOrder = true;
    }

    @Override
    /**
     * setter
     */
    public String getName() {
        return this.Name;
    }

    @Override
    /**
     * getter
     */
    public boolean isMakeOrder() {
        return this.isMakeOrder;
    }
    

    @Override
    /**
     * getter
     */
    public boolean isTakeOrder() {
        return this.isTakeOrder;
    }
}
