package Accounts;

public abstract class Client {

  private double balance;

  public Client(double balance) {
    this.balance = balance;
  }

  public void moneyToAccount(double amount) {
    balance = getBalance() + amount;
    System.out.println("Вы положили на счет: " + amount);
  }

  public void moneyFromAccount(double amount) {
    if (getBalance() >= amount) {
      balance = getBalance() - amount;
      System.out.println("Со счета списана сумма: " + amount);
    } else {
      System.out.println(
          "Недостаточно денег для списания " + amount + "\nДенег на счету: " + getBalance());
    }
  }

  public double getBalance() {
    return balance;
  }

  public abstract double getFizAccount();

  public abstract double getUrAccount();

  public abstract double getIpAccount();

}

//
//  public void AccountsBalance(double balance)
//  {
//    this.balance = balance;
//  }