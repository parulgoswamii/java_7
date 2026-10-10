public class Q23 {
    
    static class MyThread extends Thread {

        String threadName;

        MyThread(String name) {
            threadName = name;
        }

        public void run() {
            System.out.println(threadName + " is running");
        }
    }

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        MyThread t3 = new MyThread("Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}


