package Homework_3;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Group implements Iterable<Student>, Comparable<Group> {
    private List<Student> studs;
    private int groupId;
    private Teacher teacher;

    public Group(int id, List<Student> students, Teacher teacher) {
        this.studs = students;
        this.groupId = id;
        this.teacher = teacher;
        teacher.addGroup(this);
    }

    @Override
    public String toString() {
        return String.format("Group #%d, %d students, teacher - %s", getGroupId(), studs.size(), getTeacher());
    }

    @Override
    public int compareTo(Group group) {
        if (this.getStuds().size() > group.getStuds().size()) return 1;
        else if (this.getStuds().size() < group.getStuds().size()) return -1;
        else return 0;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentsGroupIterator(studs);
    }

    public void add(Student student) {
        studs.add(student);
        student.setGroupId(groupId);
    }

    public List<Student> getStuds() {
        return studs;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
        teacher.addGroup(this);
    }

    // temporary implementation of getting grades via input 
    public void setGPAs() {
        Scanner scanner = new Scanner(System.in);
        for (Student student : studs) {
            try {
                System.out.println(student);
                student.setGPA(scanner.nextDouble());
            } catch (Exception e) {
                System.out.println("GPA not setted.");
            }
        }
        scanner.close();
    }
}
