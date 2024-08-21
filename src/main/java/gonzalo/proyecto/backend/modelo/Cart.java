package gonzalo.proyecto.backend.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Item> items;

    public Cart(){
        items = new ArrayList<>();
    }

    public void empty(){
        items.clear();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double sumItems(){
        double sum = 0;
        for (Item item : items) {
            sum += item.price();
        }
        return sum;
    }
}
