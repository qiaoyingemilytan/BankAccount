public class Tester{
  public static void main(String[] args){
    BankAccount a1 = new BankAccount(0, 12345, "hello");
    System.out.println(a1.deposit(100));
    System.out.println(a1.getBalance());
    System.out.println(a1.withdraw(200));
    System.out.println(a1.getBalance());
    System.out.println(a1.toString());
  }
}
