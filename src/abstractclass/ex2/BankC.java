package abstractclass.ex2;

public class BankC extends Bank{
    private int balance;
    void deposit(int money){
        balance = balance + money;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
