package Lesson_6;

public class Workerbuilder {
    private static Workerbuilder instance = null;
    Worker obj;

    private Workerbuilder() {

    }

    public static Workerbuilder getInstance() {
        if (instance == null) instance = new Workerbuilder();
        instance.obj = new Worker();
        return instance;
    }

    public Workerbuilder setName(String name) {
        this.obj.setName(name);
        return this;
    }

    public Workerbuilder setAge(int age) {
        this.obj.setAge(age);
        return this;
    }

    public Workerbuilder setCabinet(int cabinet) {
        this.obj.setCabinet(cabinet);
        return this;
    }

    public Worker build() {
        return this.obj;
    }
}
