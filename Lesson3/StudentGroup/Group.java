package Lesson3.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Student> {
    private List<Student> studs;

    public Group(List<Student> students) {
        this.studs = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentsGroupIterator(studs);
    }

    public List<Student> getStuds() {
        return studs;
    }
}
