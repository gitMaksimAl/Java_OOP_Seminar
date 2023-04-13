package Homework_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

/**
* К коду с семинара добаить класс Teacher и возможность итерации и компорации
* для него. Так же для учебной группы добавить преподавателя(У группы может
* быть только один преподаватель, у проподавателя сколько угодно групп)
*/

    public static void main(String[] args) {
        List<Teacher> schoolTeam = new ArrayList<>();
        Group groupOne = new Group(1,
            new ArrayList<Student>(),
            new Teacher("Maria", "Ivanovna")
        );
        Group groupTwo = new Group(2,
            new ArrayList<Student>(),
            new Teacher("Inokenti", "Petrovich")
        );

        schoolTeam.add(groupOne.getTeacher());
        schoolTeam.add(groupTwo.getTeacher());

        Group groupThree = new Group(3,
            new ArrayList<Student>(),
            schoolTeam.get(1)
        );

        groupOne.add(new Student("Maksim", "Seribrenin"));
        groupOne.add(new Student("Sergey", "Maligin"));
        groupOne.add(new Student("Rustem", "Sortin"));
        groupOne.add(new Student("Antonina", "Serenkina"));
        groupTwo.add(new Student("Marina", "Artemieva"));
        groupTwo.add(new Student("Paris", "Haris"));
        groupTwo.add(new Student("Larisa", "Ivanovna"));
        groupThree.add(new Student("Nikita", "Zigankov"));
        groupThree.add(new Student("Olga", "Antonova"));
        groupThree.add(new Student("Renat", "Kalmikin"));
        groupThree.add(new Student("Sofa", "Lisk"));
        groupThree.add(new Student("Grammy", "Grammms"));

        schoolTeam.add(new Teacher("Larisa", "Adropova"));
        schoolTeam.add(new Teacher("Raisa", "Semenovna"));
        schoolTeam.add(new Teacher("Philip", "Malaligin"));

        System.out.println(groupOne);
        System.out.println("-----------Output splitter-----------");
        System.out.println(groupTwo);

        System.out.println("-----------Output splitter-----------");
        System.out.println(groupThree);

        System.out.println("-----------Output splitter-----------");
        // Iterator
        TeachersIterator it  = new TeachersIterator(schoolTeam);
        System.out.println("School Team:");
        while (it.hasNext()) System.out.println(it.next());

        System.out.println("-----------Output splitter-----------");
        // Comparing, sorting
        System.out.println((groupOne.getTeacher().compareTo(groupTwo.getTeacher()) == 0) ? "equals": "not equals");
        // Comparator
        Collections.sort(schoolTeam, new TeachersComparator());
        Teacher bestTeacher = schoolTeam.get(schoolTeam.size() - 1);
        System.out.println(bestTeacher.toString(bestTeacher.getName()));
    }
}
