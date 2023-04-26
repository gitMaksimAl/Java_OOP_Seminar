package Lesson_6;

public class Main {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        Worker bombila = Workerbuilder.getInstance().setName("Rustem").setAge(33).setCabinet(1).build();

        System.out.println(bombila);
    }
}
