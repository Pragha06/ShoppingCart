import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private double eWalletMoney;
    private List<ShoppingCart> cartItems;

    public Customer(String name, double ewalletMoney) {
        this.name=name;
        this.eWalletMoney=ewalletMoney;
        this.cartItems=new ArrayList<>();
    }


    public void addToCart(ShoppingCart itemsToCart) {

        cartItems.add(itemsToCart);
    }


    public double payFromEWallet(double totalCartPrice) {

        eWalletMoney=eWalletMoney-totalCartPrice;
        return eWalletMoney;
    }

    public double calculateTotalCartPrice()
    {
        return cartItems.stream().map(ShoppingCart::getTotalPrice).reduce(0.0,Double::sum);
    }

}
