import main.java.BankAccount;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BankAccountTest {

    private BankAccount bankAccount;

    @Before
    public void initialize() {
        this.bankAccount = new BankAccount(0, "John Doe");
    }

    @Test
    public void BankAccountNumberInitializeZero() {
        assertEquals(0, bankAccount.getAccountNumber());
    }

    @Test
    public void BankAccountHolderNameIsJohnDoe() {
        assertEquals("John Doe", bankAccount.getAccountHolderName());
    }

    @Test
    public void BankAccountBalanceZero(){
        double delta = 0.0001;
        assertEquals(0.0, bankAccount.getBalance(), delta);
    }

    @Test
    public void IncrementBalanceByTen(){
        bankAccount.deposit(10.0);
        double delta = 0.0001;
        assertEquals(10.0, bankAccount.getBalance(), delta);
    }

    @Test
    public void DecrementBalanceByTen(){
        bankAccount.deposit(10.0);
        bankAccount.withdraw(10.0);
        double delta = 0.0000;
        assertEquals(0.0, bankAccount.getBalance(), delta);
    }
}