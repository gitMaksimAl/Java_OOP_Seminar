package Lesson_6;

/**
 * worker
 */
public class Worker {

    private String name;
    private int age;
    private int cabinet;

    public String getName() {return name;}

    public int getAge() {return age;}

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public void setCabinet(int cabinet) {this.cabinet = cabinet;}

    @Override
    public String toString() {
        return String.format("Worker{name='%s', age='%d'}", getName(), getAge());
    }
}