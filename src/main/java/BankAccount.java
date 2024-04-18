import java.util.ArrayList;
import java.util.Random;
import java.math.BigInteger;

public class BankAccount {
    private final String accountHolderName;
    private BigInteger accountNumber;
    private ArrayList<BankCard> bankCards;
    private double balance;

    public BankAccount(String accountHolderName) {
        this.generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.bankCards = new ArrayList<>();
        this.balance = 0;
    }

    public void generateAccountNumber(){
        Random rand = new Random();
        String randomNumberString = "";

        for (int i = 1; i <= 25; i++){
            int digit = rand.nextInt(10);
            randomNumberString += digit;
        }
        this.accountNumber = new BigInteger(randomNumberString);
    }

    public BigInteger getAccountNumber() {
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
