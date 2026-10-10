public class Q27 {

    static class Shared {
        boolean available = false;

        synchronized void produce() {
            System.out.println("Producer is waiting...");

            available = true;
            System.out.println("Producer produced data.");

            notify();
        }

        synchronized void consume() {
            while (!available) {
                try {
                    System.out.println("Consumer is waiting...");
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }

            System.out.println("Consumer consumed data.");
        }
    }

    public static void main(String[] args) {
        Shared obj = new Shared();

        Thread consumer = new Thread(obj::consume);
        Thread producer = new Thread(obj::produce);

        consumer.start();
        producer.start();
    }
}
