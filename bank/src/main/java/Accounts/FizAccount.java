package Accounts;

public class FizAccount extends Client {

  public FizAccount(double balance) {
    super(balance);
  }

  public void moneyToAccount(double amount) {
    super.moneyToAccount(amount);
  }

  public void moneyFromAccount(double amount) {
    super.moneyFromAccount(amount);
  }

  @Override
  public double getFizAccount() {
    return 0;
  }

  @Override
  public double getUrAccount() {
    return 0;
  }

  @Override
  public double getIpAccount() {
    return 0;
  }

}
