
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount)
            throws InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException(
                "Amount cannot be negative."
            );
        }

        if (amount > balance) {
            throw new InsufficientFundsException(
                "Insufficient account balance."
            );
        }

        balance -= amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Remaining balance: " + balance);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(5000);

        try {
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
