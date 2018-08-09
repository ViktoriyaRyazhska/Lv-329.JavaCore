public class Task6 {

	public static void task6() {
		System.out.println("Input text for calculate number of words in this text");
		String str = Main.sc.nextLine();
		String[] strM = str.split(" ");

		System.out.println("number of words in this text: "+ strM.length);
		
	}
}
