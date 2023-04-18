package Lesson_6.Task2;


public class Main {
    public static void main(String[] args) {
        Cat cat = CatBuilder.getInstance().setName("Murzik").setAge(3).setColor("Red").setMood(false).build();
   
        System.out.println(cat);
   } 
}
