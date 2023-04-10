package Homework_3;

import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<Student> {
    private List<Student> studs;
    private int counter;

    public StudentsGroupIterator(List<Student> students) {
        this.studs = students;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < studs.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) return null;
        return studs.get(counter++);
    }

    public Student peek() {
        return studs.get(counter);
    }

    public void reset() {
        counter = 0;
    }
}
