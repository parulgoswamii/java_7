public class Q26 {
    
}

class Counter {

    synchronized void printCount() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(
                Thread.currentThread().getName() + ": " + i
            );
        }
    }
}

class MyThread extends Thread {

    Counter counter;

    MyThread(Counter counter, String name) {
        super(name);
        this.counter = counter;
    }

    public void run() {
        counter.printCount();
    }
}

class Main {
    public static void main(String[] args) {

        Counter c = new Counter();

        MyThread t1 = new MyThread(c, "Thread 1");
        MyThread t2 = new MyThread(c, "Thread 2");

        t1.start();
        t2.start();
    }
}
