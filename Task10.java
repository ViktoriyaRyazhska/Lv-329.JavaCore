public class Task10 {

	public static void task10() {
		System.out.println("Please input the value of the variable:");
		Long variable = Main.sc.nextLong();
		Integer variableLoopCounter = 0;
		if (variable <= 1) {
			System.out.println("Please input the value of the variable different from the recent!");
		} else {
			while (!(variable == 1)) {
				if (variable % 2 == 0) {
					variable /= 2;
					++variableLoopCounter;
				} else {
					variable = (variable * 3) + 1;
					++variableLoopCounter;
				}
			}
		}
		System.out.println(variableLoopCounter);
	}
}