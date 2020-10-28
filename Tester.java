public class Tester{
  public static void main(String[] args){
    BankAccount a1 = new BankAccount(0, 12345, "hello");
    System.out.println(a1.deposit(10));
    System.out.println(a1.getBalance());
  }
}
