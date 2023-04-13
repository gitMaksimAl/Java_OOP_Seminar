package Homework_3;

import java.util.Comparator;

public class TeachersComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher arg0, Teacher arg1) {
        if (arg0.getGroups().size() > arg1.getGroups().size()) return 1;
        else if (arg0.getGroups().size() < arg1.getGroups().size()) return -1;
        else return 0;
    }
}
