package Accounts;

public class IpAccount extends Client {

  /*
    нейминг - стоит избегать подобных имен констант,
    так как не понятно что они означают.
    Так же не рекомендуется использовать числа в именах констант.
    Так же имена переменных не соответствуют действительности - У ИП комиссия за пополнение, а не за снятие
    Можно назвать их например DEPOSIT_FEE_BEFORE_MAX и DEPOSIT_FEE_BEFORE_MIN
   */
  private final double WITHDRAW_FEE = 0.01;
  private final double WITHDRAW_FEE2 = 0.005;
//  Нет смысла перегружать конструктор, если не меняется логика его работы
  public IpAccount(double balance) {
    super(balance);
  }

  public void moneyToAccount(double amount) {
    /*
      нейминг - не рекомендуется использовать числа в именах переменных
      Так же нет смысла считать заранее оба вида комиссии.
      Лучше вычислять их по необходимости в соответствующих условных блоках
      Таким образом можно ограничиться одной переменной - fee
    */
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
//  нет смысла перегружать метод, если не меняется логика его работы
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
