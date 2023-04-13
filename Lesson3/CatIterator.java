package Lesson3;

import java.util.Iterator;
import java.util.List;

public class CatIterator implements Iterator<Cat> {
    private int counter;
    private List<Cat> cats;

    public CatIterator(List<Cat> cats) {
        this.cats = cats;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < cats.size();
    }

    @Override
    public Cat next() {
        if (!hasNext()) return null;
        return cats.get(counter++);
    }
}
