import org.testng.annotations.Test;
import org.testng.Assert;

public class ShopItem {


    @Test
    public void testShopItems()
    {
        Apple apple = new Apple("Apple", 100, 10.00);
        Milk milk = new Milk("Milk", 40, 15.00);
        NewsPaper newsPaper = new NewsPaper("NewsPaper", 100, 2.50);

        Wallet ewallet=new Wallet(700.00);
        Customer pragha=new Customer("Pragha",ewallet);

        pragha.addToCart(new ShoppingCartItems("Apple",5,apple.getPrice(),apple.getPrice()*5));
        pragha.addToCart(new ShoppingCartItems("Milk",3,milk.getPricePerLitre(),milk.getPricePerLitre()*3));
        pragha.addToCart(new ShoppingCartItems("NewsPaper",1,newsPaper.getPrice(),newsPaper.getPrice()*1));

        pragha.payFromEWallet();
        Assert.assertEquals(ewallet.getBalance(),602.5);
    }

    @Test
    public void noBalanceInWallet()
    {
        Apple apple = new Apple("Apple", 100, 10.00);
        Milk milk = new Milk("Milk", 40, 15.00);
        NewsPaper newsPaper = new NewsPaper("NewsPaper", 100, 2.50);

        Wallet ewallet=new Wallet(50.00);
        Customer pragha=new Customer("Pragha",ewallet);

        pragha.addToCart(new ShoppingCartItems("Apple",5,apple.getPrice(),apple.getPrice()*5));
        pragha.addToCart(new ShoppingCartItems("Milk",3,milk.getPricePerLitre(),milk.getPricePerLitre()*3));
        pragha.addToCart(new ShoppingCartItems("NewsPaper",1,newsPaper.getPrice(),newsPaper.getPrice()*1));

        pragha.payFromEWallet();
    }

}
