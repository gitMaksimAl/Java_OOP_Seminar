package Homework_3;

import java.util.Iterator;
import java.util.List;

public class TeachersIterator implements Iterator<Teacher> {
    List<Teacher> teachers;
    int counter;

    public TeachersIterator(List<Teacher> teachers) {
        this.teachers = teachers;
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < teachers.size();
    }

    @Override
    public Teacher next() {
        return teachers.get(counter++);
    }
}
