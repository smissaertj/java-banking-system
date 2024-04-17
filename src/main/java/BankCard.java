import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class BankCard {
    private Scanner scanner;
    private BigInteger cardNumber;
    private int cardPin;

    public BankCard(Scanner scanner) {
        generateCardNumber();
        this.cardPin = 0;
        this.scanner = scanner;
    }

    public void generateCardNumber(){
        Random rand = new Random();
        String randomNumberString = "";

        for (int i = 0; i < 16; i++){
            int digit = rand.nextInt(10);
            randomNumberString += digit;
        }

        this.cardNumber =  new BigInteger(randomNumberString);
    }

    public BigInteger getCardNumber(){
        return this.cardNumber;
    }

    public void setCardPin(){
        while (true) {
            System.out.print("Create a new Card PIN: ");
            int cardPin = Integer.parseInt(scanner.nextLine());
            System.out.println("Confirm new Card PIN: ");
            int confirmCardPin = Integer.parseInt(scanner.nextLine());

            if (confirmCardPin == cardPin) {
                this.cardPin = cardPin;
                break;
            } else {
                System.out.println("PINs do not match. Please try again.");
            }
        }
    }
}
