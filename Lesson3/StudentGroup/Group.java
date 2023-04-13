package Lesson3.StudentGroup;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Group implements Iterable<Student>, Comparable<Group> {
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

    @Override
    public int compareTo(Group group) {
        if (this.studs.size() > group.getStuds().size()) return 1;
        else if (this.studs.size() < group.getStuds().size()) return -1;
        else return 0;
    }

    public void setGPAs(StudentsGroupIterator it) {
        Scanner scanner = new Scanner(System.in);
        while (it.hasNext()) {
            System.out.println(it.peek());
            try {
                it.next().setGPA(scanner.nextDouble());
            } catch (Exception e) {
                System.out.println("Can`t set GPA.");
            }
        }
        scanner.close();
    }
}
