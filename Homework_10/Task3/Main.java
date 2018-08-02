package Task3;


public class Main {
    public static void main(String args[]) {
        Thread two = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread number two");
            }
            Thread three = new Thread(() -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Thread number three");
                }
            });
            three.start();
        });
        Thread one = new Thread(() -> two.start());
        one.start();
    }
}
