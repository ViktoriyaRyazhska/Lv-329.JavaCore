
public class Task3 {

	public static  void task3() {
		System.out.println("Input cost of dollar");
		int dollar = Main.sc.nextInt();
		System.out.println("Input sum of money in gryvna");
		int gryvna = Main.sc.nextInt();

		int buy = gryvna / dollar;
		int rest = gryvna % dollar;
		System.out.println("User can buy and change " + buy + " dollars and rest " + rest + " gryvna.");
	}

}
