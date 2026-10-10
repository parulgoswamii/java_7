public class Q4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            int a = 20, b = 0;
            System.out.println("Division: " + (a / b));

            try {
                System.out.println("Array value: " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index.");
            }

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
