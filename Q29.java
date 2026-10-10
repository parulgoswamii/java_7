public class Q29 {
    
}

class MyThread extends Thread {

    public void run() {
        while (true) {
            System.out.println("Daemon thread is running...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class Main {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.setDaemon(true);
        t.start();

        System.out.println("Main thread is finishing.");
    }
}
