public class Task1 {
	static int a=0;
	static int b=1;
	static int c=a+b;
	public void task1() {
		System.out.println("To generate Fibonacci sequence:");
		while(c<20) {
			System.out.print(c+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}