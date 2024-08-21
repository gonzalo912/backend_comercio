package gonzalo.proyecto.backend.modelo;

import java.util.List;

public class Client {
    String name;
    Cart cart;
    List

    public Client(String name){
        this.name = name;
        this.cart = new Cart();
    }

    public emptyCart(){
        this.cart.empty();
    }

    public makeOrder(){ //go to checkout
        order = new Order(this.cart);
    }
}
