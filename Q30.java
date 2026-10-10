public class Q30 {

}

class Table {

    void printTable(int n) {

        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }
}

class MyThread extends Thread {

    Table table;
    int number;

    MyThread(Table table, int number) {
        this.table = table;
        this.number = number;
    }

    public void run() {
        table.printTable(number);
    }
}

class Main {
    public static void main(String[] args) {

        Table obj = new Table();

        MyThread t1 = new MyThread(obj, 2);
        MyThread t2 = new MyThread(obj, 5);

        t1.start();
        t2.start();
    }
}
