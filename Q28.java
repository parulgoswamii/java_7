public class Q28 {
    
static class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + ": " + i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public static class Main {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.setName("Thread 1");

        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        System.out.println("Main thread continues.");
    }
}

}
