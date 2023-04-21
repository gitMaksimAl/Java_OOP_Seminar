package Lesson_7;

public class Cat extends Animal {
    private boolean isInGoodMood;
    private int hunger;

    public Cat(boolean mood, int hunger) {
        this.isInGoodMood = mood;
        this.hunger = hunger;
    }

    @Override
    public void voice() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'voice'");
    }

    @Override
    public void feed(int hunger) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'feed'");
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setInGoodMood(boolean isInGoodMood) {
        this.isInGoodMood = isInGoodMood;
    }

    public int getHunger() {
        return hunger;
    }

    public boolean isInGoodMood() {
        return isInGoodMood;
    }
    
}
