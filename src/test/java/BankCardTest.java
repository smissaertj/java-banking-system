import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BankCardTest {

    private BankCard card;
    private Scanner scanner;

    @Before
    public void initialize(){
        this.scanner = new Scanner(System.in);
        this.card = new BankCard(scanner);
    }

    @Test
    public void testGenerateCardNumber() {
        card.generateCardNumber();
        BigInteger cardNumber = card.getCardNumber();
        assertTrue(cardNumber.compareTo(BigInteger.ZERO) > 0);
    }

    @Test
    public void testCardNumberLength(){
        card.generateCardNumber();
        BigInteger cardNumber = card.getCardNumber();
        int length = cardNumber.abs().toString().length();
        assertEquals(16, length);
    }

}
