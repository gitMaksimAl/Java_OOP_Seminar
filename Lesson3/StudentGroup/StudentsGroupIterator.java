package Lesson3.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<Student> {
    private List<Student> studs;
    private int couter;

    public StudentsGroupIterator(List<Student> students) {
        this.studs = students;
        this.couter = 0;
    }

    @Override
    public boolean hasNext() {
        return couter < studs.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) return null;
        return studs.get(couter++);
    }
}
