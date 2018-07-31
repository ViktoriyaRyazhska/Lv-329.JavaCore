package Ex1;
import static Ex1.ThreadColor.ANSI_PURPLE;
import static Ex1.ThreadColor.ANSI_RESET;
public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(ANSI_PURPLE + "Thread 1 is working." + ANSI_RESET);
		}
	}
}