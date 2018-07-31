package Ex1;

public class App {
	public static void main(String[] args) {
		Runnable r1 = new ThreadOne();
		Thread t1 = new Thread(r1);
		Runnable r2 = new ThreadTwo();
		Thread t2 = new Thread(r2);
		Runnable r3 = new ThreadThree();
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		t3.start();
	}

}
