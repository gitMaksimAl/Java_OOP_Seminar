package Lesson_7;

public class Dog extends Animal{
    private String breed;
    private int hunger;

    public Dog(String breed, int hunger) {
        this.breed = breed;
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


    public int getHunger() {
        return hunger;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
