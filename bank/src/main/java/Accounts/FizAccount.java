package Accounts;

public class FizAccount extends Client {
// нет смысла в перегрузке конструктора, если не меняется логика его работы
  public FizAccount(double balance) {
    super(balance);
  }

  public void moneyToAccount(double amount) {
    super.moneyToAccount(amount);
  }

  public void moneyFromAccount(double amount) {
    super.moneyFromAccount(amount);
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
