public class VariableThread13 implements Runnable {
    @Override
    public void run() {
        synchronized (Homework10.class) {
            for (Integer variableLoopCounter = 0; variableLoopCounter < 5; variableLoopCounter++) {
                System.out.println("This message is represent of work of the third thread.");
            }
        }
    }
}