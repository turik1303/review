/*
  Структура модуля - не лучшая идея располагать базовый класс в одном пакете с дочерними классами
  Более подходящая структура:
  bank
    Account.java
    impl
      FizAccount.java
      IpAccount.java
      UrAccount.java

 */

package Accounts; // имена пакетов в Java должны оформляться в нижнем регистре

public abstract class Client {  // логичнее было бы имя класса Account

  private double balance;
  /*
    стоило бы сделать конструктор по умолчанию (без параметров),
    так как счет может быть открыт и без поступления на него средств
 */
  public Client(double balance) {
    this.balance = balance;
  }
  /*
    нейминг: пополнение счета логичнее назвать deposit()
 */
  public void moneyToAccount(double amount) {
    balance = getBalance() + amount;
    System.out.println("Вы положили на счет: " + amount);
  }
  /*
    нейминг: вывод средств с аккаунта логичнее назвать withdraw()
 */
  public void moneyFromAccount(double amount) {
    if (getBalance() >= amount) {       // для обращения к переменным класса не обязательно использовать геттеры,
      balance = getBalance() - amount;  // можно обращаться напрямую к полям класса
      System.out.println("Со счета списана сумма: " + amount);
    } else {
      // в идеале, вместо вывода ошибки в консоль, тут стоить бросить исключение
      System.out.println(
          "Недостаточно денег для списания " + amount + "\nДенег на счету: " + getBalance());
    }
  }

  public double getBalance() {
    return balance;
  }

  // данные методы не нужны, так как для получения баланса есть соответствующий геттер getBalance()
  public abstract double getFizAccount();

  public abstract double getUrAccount();

  public abstract double getIpAccount();

}
//  не стоит оставлять закомментированные методы в коде
//
//  public void AccountsBalance(double balance)
//  {
//    this.balance = balance;
//  }