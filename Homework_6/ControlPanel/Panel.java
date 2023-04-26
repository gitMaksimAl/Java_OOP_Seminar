package Homework_6.ControlPanel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Homework_6.Product;

/**
 * Панель с кнопками. Необходим список продуктов для инициализации.
 */
public class Panel {
    Map<Integer, String> buttons = new HashMap<>();

    public void addButton(Product product, int num) {
            buttons.put(num, String.format("%s   %.2f",
                product.getName(),
                product.getCoast())
            );
    }

    public boolean pushButton(int index) {
        return buttons.containsKey(index);
    }

    public String getButtons() {
        if (buttons.isEmpty()) return "Machine is empty.";
        else return buttons.toString();
    }

    public void resetButtons() {
        this.buttons.clear();
        this.buttons = new HashMap<>();
    }

    @Override
    public String toString() {
        return String.format("Panel{buttons='%s'}",
            this.buttons.toString()
        );
    }
}
