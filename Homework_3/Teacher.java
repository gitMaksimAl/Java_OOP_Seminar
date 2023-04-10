package Homework_3;
import java.util.HashMap;
import java.util.Map;

public class Teacher implements Comparable<Teacher>{
    private String name;
    private String lastName;
    private Map<Integer, Group> groups;

    public Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.groups = new HashMap<Integer, Group>();
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Teacher o) {
        if (groups.size() > o.getGroups().size()) return 1;
        else if (groups.size() < o.getGroups().size()) return -1;
        else return 0;
    }

    public Map<Integer, Group> getGroups() {
        return groups;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getName(), getLastName());
    }

    public String toString(String name) {
        if (this.name.equals(name)) return String.format("%s leads %d groups", toString(), groups.size());
        return toString();
    }

    public void addGroup(Group group) {
        groups.put(group.getGroupId(), group);
    }
}
