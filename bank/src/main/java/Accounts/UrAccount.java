package Accounts;

public class UrAccount extends Client {

  private final double WITHDRAW_FEE = 0.01;

  public UrAccount(double balance) {
    super(balance);
  }

  public void moneyToAccount(double amount) {

    super.moneyToAccount(amount);
  }

  public void moneyFromAccount(double amount) {
    double bankFee = amount * WITHDRAW_FEE;
    double amountBankFee = amount + bankFee;
    super.moneyFromAccount(amountBankFee);
    System.out.println("Комиссия: 1% " + bankFee);
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
