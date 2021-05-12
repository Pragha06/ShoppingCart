public class Wallet implements IWallet {

    private double balance;

    public Wallet(double balance) {
        this.balance=balance;
    }


    @Override
    public void addCash(double amount) {
        this.balance=amount;
    }

    @Override
    public double deductMoney(double amount) {
      this.balance=balance-amount;
      return balance;
    }

    @Override
    public double getBalance() {
     return balance;
    }
}
