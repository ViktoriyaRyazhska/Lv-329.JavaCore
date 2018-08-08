public class Task12 {
    public static void main(String[] args) {
        Integer variable = 1000;
        Integer variable0 = 0;
        for (Integer variableLoopCounter = 1; variableLoopCounter < variable; variableLoopCounter++) {
            if ((variableLoopCounter % 3 == 0) || (variableLoopCounter % 5 == 0)) {
                variable0 += variableLoopCounter;
            }
        }
        System.out.println(variable0);
    }
}