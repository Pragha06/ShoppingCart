import org.testng.Assert;
import org.testng.annotations.Test;

public class ShopItem {


    @Test
    public void testShopItems()
    {
        Items apple = new Items(Product.Apple, 100, 10);
        Items milk = new Items(Product.Milk, 40, 15);
        Items newsPaper = new Items(Product.NewsPaper, 100, 2.50);

        Customer pragha=new Customer("Pragha",700.00);

        pragha.addToCart(new ShoppingCart(Product.Apple,10,apple.getPrice(),apple.getPrice()*10));
        pragha.addToCart(new ShoppingCart(Product.Milk,3,milk.getPrice(),milk.getPrice()*3));
        pragha.addToCart(new ShoppingCart(Product.NewsPaper,1,newsPaper.getPrice(),newsPaper.getPrice()*1));

        double totalCartPrice=pragha.calculateTotalCartPrice();
        double eWalletBalance=pragha.payFromEWallet(totalCartPrice);

        Assert.assertEquals(totalCartPrice,147.50);
        Assert.assertEquals(eWalletBalance,552.50);

    }

}
