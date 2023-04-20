package Homework_6.ControlPanel;

import java.util.ArrayList;
import java.util.List;

import Homework_6.Product;

public class Panel<T extends Product> {
    private List<String> buttons = new ArrayList<>();

    public Panel(List<T> products) {
        for (T product: products) {
            buttons.add(product.getName());
        }
    }

    public String pushButton(int index) {
        return buttons.get(index);
    }

    public List<String> getButtons() {
        return buttons;
    }
}
