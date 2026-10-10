package Q21;

public class Main {
    public static void main(String[] args) {

        MyThread t = new MyThread();

        t.start();
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            // Thread task goes here.
        }
    }
}
