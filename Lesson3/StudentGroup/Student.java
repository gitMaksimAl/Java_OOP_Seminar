package Lesson3.StudentGroup;

public class Student {
    private String name;
    private String lastName;
    private int groupId;

    public Student(String name, String lastName, int group) {
        this.name = name;
        this.lastName = lastName;
        this.groupId = group;
    }

    @Override
    public String toString() {
        return String.format("%s %s from %d goup", getName(), getLastName(), getGroupId());
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroupId() {
        return groupId;
    }
}
