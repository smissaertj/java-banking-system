import exceptions.InsufficientFundsExecption;

public class Main {

    public static void main(String[] args) throws InsufficientFundsExecption {

        Bank bank = new Bank("Bank One");

        BankAccount account1 = new BankAccount(1234, "John Doe");
        bank.addAccount(account1);
        account1.addBankCard();


        BankAccount account2 = new BankAccount(5678, "Jane Doe");
        bank.addAccount(account2);

        account1.deposit(500);
        bank.transferMoney(account1, account2, 500);
        bank.getReport(account1);
        bank.getReport(account2);

        int withdrawAmount = 600;
        if (withdrawAmount > account1.getBalance()) {
            throw new InsufficientFundsExecption("Insufficient funds");
        } else {
            account1.withdraw(withdrawAmount);
        }

    }

}
