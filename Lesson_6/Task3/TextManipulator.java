package Lesson_6.Task3;

public class TextManipulator {
    private Text text;

    public TextManipulator(String text) {
        this.text = new Text(text);
    }
    public void appendText(String newText) {
        String tmp = text.getText();
        tmp.concat(newText);
        text.setText(tmp);
    }

    public void foundWordAndReplace(String word, String replacementWord) {
        String tmp = text.getText();
        if (tmp.contains(word)) text.setText(tmp.replace(word, replacementWord));
    }

    public void  foundWordAndDelete(String word) {
        String tmp = text.getText();
        if (tmp.contains(word)) text.setText(tmp.replace(word, ""));
    }

    @Override
    public String toString() {
        return String.format("Text{text='%s'}", text.getText());
    }
}
