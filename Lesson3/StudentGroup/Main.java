package Lesson3.StudentGroup;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

/**
Создать класс Студент
* - Создать класс УчебнаяГруппаИтератор
* - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
* - Реализовать его контракты (включая удаление)
*/

    public static void main(String[] args) {
        Group groupOne = new Group(new ArrayList<Student>());
        groupOne.getStuds().add(new Student("Maksim", "Seribrenin", 1));
        groupOne.getStuds().add(new Student("Sergey", "Maligin", 1));
        groupOne.getStuds().add(new Student("Rustem", "Sortin", 1));
        groupOne.getStuds().add(new Student("Antonina", "Serenkina", 1));

        StudentsGroupIterator it = new StudentsGroupIterator(groupOne.getStuds());
        while (it.hasNext()) System.out.println(it.next());
        // iterator ended !!!!

        System.out.println("-----------Output divisor-----------");
        it.reset();
        groupOne.setGPAs(it);

        Collections.sort(groupOne.getStuds(), new StudentComparator());
        it.reset();
        System.out.println("-----------Output divisor-----------");
        while (it.hasNext()) System.out.println(it.next());
    }
}
