package Homework_3;
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    /**
    * Создать класс СтудентКомпаратор реализующий интерфейс Comparator
    *- Реализовать контракт compare () со сравнением по какому-либо параметру
    * (пример: сочетание Имя+Фамилия) 
    */

    @Override
    public int compare(Student arg0, Student arg1) {
        if (arg0.getGPA() > arg1.getGPA()) return 1;
        else if (arg0.getGPA() < arg1.getGPA()) return -1;
        else return 0;
    }
}
