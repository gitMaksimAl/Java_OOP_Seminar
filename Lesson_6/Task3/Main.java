package Lesson_6.Task3;

public class Main {
    public static void main(String[] args) {
        TextManipulator editor = new TextManipulator("Мама мыла раму.");
        System.out.println(editor);
        editor.foundWordAndReplace("раму", "окно");
        System.out.println(editor);
    }
}
