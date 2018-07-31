package Ex1;
import static Ex1.ThreadColor.ANSI_BLUE;
import static Ex1.ThreadColor.ANSI_RESET;
public class ThreadThree implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(ANSI_BLUE + "Thread 1 is working." + ANSI_RESET);
		}
	}
}