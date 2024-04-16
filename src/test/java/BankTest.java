import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BankTest {

    private Bank bank;

    @Before
    public void initialize() {
        this.bank = new Bank("Bank One");
    }

    @Test
    public void getBankName() {
        assertEquals("Bank One", bank.getBankName());
    }

    @Test
    public void accountListIsEmpty() {
        assertTrue(bank.getAccountList().isEmpty());
    }

    @Test
    public void accountListHasOneAccount() {
        BankAccount account = new BankAccount(1234, "John Doe");
        bank.addAccount(account);
        assertEquals(1, bank.getAccountList().size());
    }

    @Test
    public void getAccountByNumber() {
        BankAccount account = new BankAccount(1234, "John Doe");
        bank.addAccount(account);
        Object result = bank.getAccountByNumber(1234);
        assertTrue(result instanceof BankAccount);
        assertEquals(1234, ((BankAccount) result).getAccountNumber());
    }

    @Test
    public void transferMoney() {
        BankAccount account1 = new BankAccount(1234, "John Doe");
        BankAccount account2 = new BankAccount(4321, "Jane Doe");

        double delta = 0.0001;

        account1.deposit(1000);
        assertEquals(1000.00, account1.getBalance(), delta);

        bank.transferMoney(account1, account2, 1000);
        assertEquals(0.0, account1.getBalance(), delta);
        assertEquals(1000.00, account2.getBalance(), delta);
    }
}
