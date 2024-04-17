import java.util.ArrayList;

public class BankAccount {
    private final int accountNumber;
    private final String accountHolderName;
    private ArrayList<BankCard> bankCards;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    public double getBalance() {
        return this.balance;
    }

    public double deposit(double amount){
        this.balance += amount;
        return amount;
    }

    public double withdraw(double amount){
        this.balance -= amount;
        return amount;
    }

    public BankCard addBankCard(){
        BankCard card = new BankCard();
        card.setCardPin();
        this.bankCards.add(card);
        return card;
    }

    public ArrayList<BankCard> getBankCards() {
        return this.bankCards;
    }
}
