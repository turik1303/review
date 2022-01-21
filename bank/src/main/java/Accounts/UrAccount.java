package Accounts;

public class UrAccount extends Client {

  private final double WITHDRAW_FEE = 0.01;
// Нет смысла перегружать конструктор, если не меняется логика его работы
  public UrAccount(double balance) {
    super(balance);
  }
// Нет смысла перегружать метод, если не меняется логика его работы
  public void moneyToAccount(double amount) {

    super.moneyToAccount(amount);
  }

  public void moneyFromAccount(double amount) {
    double bankFee = amount * WITHDRAW_FEE;
    double amountBankFee = amount + bankFee;
    super.moneyFromAccount(amountBankFee);
    System.out.println("Комиссия: 1% " + bankFee);
  }

    /*
      данные методы (getFizAccount, getUrAccount и getIpAccount) не нужны, так как для получения баланса есть
      соответствующий геттер getBalance()
    */
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
