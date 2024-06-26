import java.util.ArrayList;

public class Bank {
    private final String bankName;
    private ArrayList<BankAccount> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public String getBankName() {
        return this.bankName;
    }

    public ArrayList<BankAccount> getAccountList() {
        return this.accounts;
    }

    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public BankAccount getAccountByNumber(int account) {
        for (BankAccount acc : this.accounts) {
            if (acc.getAccountNumber() == account) {
                return acc;
            }
        }

        return null;
    }

    public void transferMoney(BankAccount accountFrom, BankAccount accountTo, double amount) {
        accountFrom.withdraw(amount);
        accountTo.deposit(amount);
    }

    public ArrayList<BankCard> getBankCards(BankAccount account){
        ArrayList<BankCard> bankCards = new ArrayList<>();
        for (BankAccount acc : this.accounts) {
            if (acc.getAccountNumber() == account.getAccountNumber()) {
                bankCards = acc.getBankCards();
            }
        }
        return bankCards;
    }

    public void getReport(BankAccount account) {
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Cards: ");
        for (BankCard card : account.getBankCards()) {
            System.out.println(card.getCardNumber());
        }
        System.out.println();
    }
}
