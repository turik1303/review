package Accounts;

public class IpAccount extends Client {

  private final double WITHDRAW_FEE = 0.01;
  private final double WITHDRAW_FEE2 = 0.005;

  public IpAccount(double balance) {
    super(balance);
  }

  public void moneyToAccount(double amount) {
    double bankFee = amount * WITHDRAW_FEE;
    double bankFee2 = amount * WITHDRAW_FEE2;
    if (amount < 1000.0) {
      super.moneyToAccount(amount - bankFee);
      System.out.println("Комиссия: 1% " + bankFee);
    }
    if (amount >= 1000.0) {
      super.moneyToAccount(amount - bankFee2);
      System.out.println("Комиссия: 0.5% " + bankFee2);
    }
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
