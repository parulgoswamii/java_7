public class Q24 {
    
}

class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.start();
    }
}
