package Homework_3;

public class Student {
    private String name;
    private String lastName;
    private int groupId;
    private double GPA;

    public Student(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
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

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public void setGPA(double gPA) {
        GPA = gPA;
    }

    public double getGPA() {
        return GPA;
    }
}
