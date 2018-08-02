package Task1;

public class Main {
    public static void main(String args[]) {
        Thread t1 = new MyThread("Message from thread 1.");
        Thread t2 = new MyThread("Message from thread 2.");
        Thread t3 = new MyThread("Message from thread 3.");
        t1.start();
        t2.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }
}
