public class BankAccount {
    public int balance = 0;

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) {
        balance -= money;
    }

}
