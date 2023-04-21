package Lesson_7;

public class Owl extends Animal {
    private boolean isDomesticated;
    private int hunger;

    public Owl(boolean domesticated, int hunger) {
        this.isDomesticated = domesticated;
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

    public void setDomesticated(boolean isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    public boolean getDomesticated() {
        return isDomesticated;
    }
    
}
