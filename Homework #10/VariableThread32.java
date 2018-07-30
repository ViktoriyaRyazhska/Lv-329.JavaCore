public class VariableThread32 implements Runnable {
    @Override
    public void run() {
        for (Integer variableLoopCounter = 0; variableLoopCounter < 5; variableLoopCounter++) {
            System.out.println("This message is represent of work of the second thread.");
        }
        Runnable runnable33 = new VariableThread33();
        Thread thread33 = new Thread(runnable33);
        thread33.start();
    }
}