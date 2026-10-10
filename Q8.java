
import java.util.Scanner;

public class Q8 {
    static int readNumber(String input)
            throws NumberFormatException {
        return Integer.parseInt(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            int number = readNumber(input);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } finally {
            sc.close();
        }
    }
}
