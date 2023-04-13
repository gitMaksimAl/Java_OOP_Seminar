package Lesson3;

import java.util.Iterator;
import java.util.List;

public class CatShellter implements Iterable<Cat> {
    private List<Cat> cats;

    public CatShellter(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public Iterator<Cat> iterator() {
        return new CatIterator(cats);
    } 

    public List<Cat> getCats() {
        return cats;
    }
}
