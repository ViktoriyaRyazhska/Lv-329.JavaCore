public class VariableThread31 implements Runnable {
    @Override
    public void run() {
        Runnable runnable32 = new VariableThread32();
        Thread thread32 = new Thread(runnable32);
        thread32.start();
    }
}