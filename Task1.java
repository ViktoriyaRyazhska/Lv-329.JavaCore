public class Task1 {

	public static void task1() {
		System.out.println("1.Input number for generate Fibonacci sequence:");
		Integer variable = Main.sc.nextInt();
		Integer[] variableArray = new Integer[variable];
		variableArray[0] = 1;
		variableArray[1] = 1;
		for (Integer variableLoopCounter = 2; variableLoopCounter < variable; variableLoopCounter++) {
			variableArray[variableLoopCounter] = variableArray[variableLoopCounter - 2]
					+ variableArray[variableLoopCounter - 1];
		}
		for (Integer variableLoopCounter = 0; variableLoopCounter < variable; variableLoopCounter++) {
			System.out.print(variableArray[variableLoopCounter] + " ");
		}
		System.out.println();
	}
}