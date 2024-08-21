package gonzalo.proyecto.backend.modelo;

public class Order {
    Cart cart;
    double finalPrice;

    public Order(Cart aCart){
        cart = aCart;
        finalPrice = this.calculate();
    }

    //se aplican tarifas de todo tipo, impuestos, etc
    private double calculate(){
        return cart.sumItems();
    }

}
