package Lesson_6;

/**
 * worker
 */
public class Worker {

    private String name;
    private int age;
    private int cabinet;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Worker(String name) {
        this.name = name;
    }
    
    public Worker(int age) {
        this.age = age;
    }

    public Worker(String name, int age, int cabinet) {
        this.name = name;
        this.age = age;
        this.cabinet = cabinet;
    }
    
    public Worker(String name, int cabinet) {
        this.name = name;
        this.cabinet = cabinet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Worker{name='%s', age='%d'}", getName(), getAge());
    }
}