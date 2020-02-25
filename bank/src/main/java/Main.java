import Accounts.Client;
import Accounts.FizAccount;
import Accounts.IpAccount;
import Accounts.UrAccount;

public class Main {

  public static void main(String[] args) {

    Client Ip = new IpAccount(0);
    Client ur = new UrAccount(0);
    Client fiz = new FizAccount(0);

    System.out.println("\nФИЗ СЧЕТ");
    System.out.println("Денег на счете: " + fiz.getBalance());
    fiz.moneyToAccount(2000);
    fiz.moneyFromAccount(1999);
    System.out.println("Денег на счете: " + fiz.getBalance());
    fiz.moneyFromAccount(1999);

    System.out.println("\nЮР СЧЕТ");
    System.out.println("Денег на счете: " + ur.getBalance());
    ur.moneyToAccount(2000);
    ur.moneyFromAccount(400.);
    System.out.println("Денег на счете: " + ur.getBalance());
    ur.moneyFromAccount(400.);
    System.out.println("Денег на счете: " + ur.getBalance());

    System.out.println("\nИД СЧЕТ");
    System.out.println("Денег на счете: " + Ip.getBalance());
    Ip.moneyToAccount(10000);
    System.out.println("Денег на счете: " + Ip.getBalance());
    Ip.moneyFromAccount(5000);
    System.out.println("Денег на счете: " + Ip.getBalance());
  }
}

