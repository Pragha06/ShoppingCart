public class Items {

    private Product name;
    private int quantity;
    private double price;

    Items(Product name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

}

