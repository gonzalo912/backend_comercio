package gonzalo.proyecto.backend.modelo;

public class Item {
    double itemPrice;

    public Item(double price){
        this.itemPrice = price;
    }

    public double price(){
        return itemPrice;
    }
}
