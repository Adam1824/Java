import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void hasBalance() {
        BankAccount bankAccount = new BankAccount();

        assertEquals(bankAccount.balance, 0);
    }

    @org.junit.jupiter.api.Test
    void canDeposit() {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10);

        assertEquals(bankAccount.balance, 10);
    }

    @org.junit.jupiter.api.Test
    void canWithdraw() {
        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(10);
        bankAccount.withdraw(10);

        assertEquals(bankAccount.balance, 0);

    }

}