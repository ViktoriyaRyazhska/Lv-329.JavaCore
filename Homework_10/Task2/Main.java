package Task2;

public class Main {
    private static final String endMain = "End main";
    private static final String endThread = "End thread";

    public static void main(String args[]) throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                synchronized (endMain) {
                    Thread.yield();
                    synchronized (endThread) {
                        System.out.println(endMain);
                    }
                }
            }
        };
        t.start();
        synchronized (endThread) {
            Thread.sleep(200);
            synchronized (endMain) {
                System.out.println(endThread);
            }
        }
    }
}
