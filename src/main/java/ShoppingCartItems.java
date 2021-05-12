import java.util.List;

public class ShoppingCartItems {

  private String name;
  private int quantity;
  private double price;
  private double totalPrice;

  public ShoppingCartItems(String name, int quantity, double price, double totalPrice) {
    this.name=name;
    this.quantity=quantity;
    this.price=price;
    this.totalPrice=totalPrice;
  }

  public double getTotalPrice() {
    return totalPrice;
  }



}






