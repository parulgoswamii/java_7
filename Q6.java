
import java.util.Scanner;

public class Q6 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException(
                "Age must be 18 or above."
            );
        }
        System.out.println("Eligible.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            checkAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
