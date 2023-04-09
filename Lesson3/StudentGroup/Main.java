package Lesson3.StudentGroup;

import java.util.List;

public class Main {

/**
Создать класс Студент
* - Создать класс УчебнаяГруппаИтератор
* - Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
* - Реализовать его контракты (включая удаление)
*/

    public static void main(String[] args) {
        Group groupOne = new Group(List.of(
            new Student("Maksim", "Riskin", 1),
            new Student("Artem", "Nozhkin", 1),
            new Student("Rustem", "Sinarilloff", 1)
        ));

        StudentsGroupIterator it = new StudentsGroupIterator(groupOne.getStuds());

        while (it.hasNext()) System.out.println(it.next());
    }
}
