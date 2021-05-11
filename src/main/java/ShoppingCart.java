
public class ShoppingCart {

  private Product name;
  private int quantity;
  private double price;
  private double totalPrice;


  public ShoppingCart(Product name, int quantity, double price, double totalPrice) {
    this.name=name;
    this.quantity=quantity;
    this.price=price;
    this.totalPrice=totalPrice;
  }

  public double getTotalPrice() {
    return totalPrice;
  }


}






