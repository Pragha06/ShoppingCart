import java.util.ArrayList;
import java.util.List;

public class Customer implements ICustomer{

    private String name;
    private Wallet ewallet;
    private List<ShoppingCartItems> cartItems;
    ShoppingCartItems cart;

    public Customer(String name, Wallet ewallet) {
        this.name=name;
        this.ewallet=ewallet;
        this.cartItems=new ArrayList<>();
    }


    @Override
    public void addToCart(ShoppingCartItems itemsToCart) {

        cartItems.add(itemsToCart);
    }

    @Override
    public void payFromEWallet() {

        double priceToBePaid=calculateTotalCartPrice();
        double eWalletBalance=ewallet.getBalance();

        if(eWalletBalance>priceToBePaid) {
            ewallet.deductMoney(priceToBePaid);
        }
        else
            System.out.println("Not enough balance in e-wallet");
    }

    public double calculateTotalCartPrice()
    {
        return cartItems.stream().map(ShoppingCartItems::getTotalPrice).reduce(0.0,Double::sum);
    }


}
