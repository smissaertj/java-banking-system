import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank("Bank One");

        while (true) {
            int choice = welcome(scanner);
            if (choice == 1) {
                System.out.print("Enter your full name: ");
                String fullName = scanner.nextLine();
                BankAccount account = new BankAccount(fullName);
                account.addBankCard();
                bank.addAccount(account);
                System.out.println("===== Your account has been added to the bank =====");
                bank.getReport(account);
                System.out.println("========= Take note of the above details ==========");

            } else if (choice == 2) {
                System.out.print("Enter your account number: ");
                BigInteger accountNumber = new BigInteger(scanner.nextLine());
                BankAccount account = bank.getAccountByNumber(accountNumber);
                if (account != null) {
                    bank.getReport(account);
                } else {
                    System.out.println("===== Account Not Found =====");
                }
            } else if (choice == 3) {
                System.out.print("Enter your account number: ");
                BigInteger accountNumber = new BigInteger(scanner.nextLine());
                BankAccount account = bank.getAccountByNumber(accountNumber);
                if (account != null) {
                    accOperations(scanner, account);
                } else {
                    System.out.println("===== Account Not Found =====");
                }

            } else if (choice == 4) {
                System.out.println("===== Thank you for using Bank One. Goodbye! =====");
                break;

            } else {
                System.out.println("===== Invalid choice. Please try again. =====");
            }
        }

        scanner.close();
    }

    public static int welcome(Scanner scanner) {
        System.out.println("""
                 ====================================
                 |                                  |
                 |         Welcome to Bank One      |
                 |       ======================     |
                 |                                  |
                 |       1. Create Account          |
                 |       2. Account Report          |
                 |       3. Account Operations      |
                 |       4. Quit                    |
                 |                                  |
                 ====================================
                """);
        System.out.print("Enter your choice (digit): ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static void accOperations(Scanner scanner, BankAccount account) {
        System.out.println("""
                 ====================================
                 |                                  |
                 |         Welcome to Bank One      |
                 |       ======================     |
                 |                                  |
                 |       1. Check Balance           |
                 |       2. Deposit                 |
                 |       3. Withdraw                |
                 |       4. Transfer                |
                 |       5. Return                  |
                 |                                  |
                 ====================================
                """);
        System.out.print("Enter your choice (digit): ");
        int choice = Integer.parseInt(scanner.nextLine());

        while (true) {
            if (choice == 1) {
                System.out.println("==== Account Balance: " + account.getBalance() + " ====");
            } else if (choice == 5) {
               break;
            }
        }
        welcome(scanner);
    }

}
