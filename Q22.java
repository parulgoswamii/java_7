public class Q22 {
    
static class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread created using Runnable interface.");
    }

    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();

        Thread t = new Thread(obj);

        t.start();
    }
}
}
