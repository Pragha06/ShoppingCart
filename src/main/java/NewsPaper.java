public class NewsPaper {

    int quantity;
    double price;
    String name;

    public NewsPaper(String name, int quantity, double price) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getPrice()
    {
        return price;
    }

    public String getName()
    {
        return name;
    }
}
