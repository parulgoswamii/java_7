
public class Q9 {
    static int display() {
        try {
            System.out.println("Inside try block");
            return 10;
        } finally {
            System.out.println("Inside finally block");
        }
    }

    public static void main(String[] args) {
        int result = display();
        System.out.println("Returned value: " + result);
    }
}
