package abstractclass.ex2;


/**Abstract class exercise 2

 Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively.
 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
 Call this method by creating an object of each of the three classes.*/


public class Main {
    public static void main(String[] args) {
        BankA sold1 = new BankA();
        BankB sold2 = new BankB();
        BankC sold3 = new BankC();

        sold1.deposit(100);
        sold2.deposit(200);
        sold3.deposit(300);
        System.out.println("Balance is : "+ sold1.getBalance());
        System.out.println("Balance is : "+ sold2.getBalance());
        System.out.println("Balance is : "+ sold3.getBalance());
    }
}