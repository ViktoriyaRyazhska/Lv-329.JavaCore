public class VariableThread33 implements Runnable {
    @Override
    public void run() {
        for (Integer variableLoopCounter = 0; variableLoopCounter < 5; variableLoopCounter++) {
            System.out.println("This message is represent of work of the third thread.");
        }
    }
}