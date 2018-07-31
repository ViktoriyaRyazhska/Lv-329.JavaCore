package homework10.Task2;

public class task2 {
    public final static Object ob = new Object();

    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread1");
    }

}

class MyThread extends Thread {

    MyThread(String name){
        super(name);
    }

    public void run(){
        synchronized (task2.ob){
            System.out.println("Ok");
            Thread.yield();
        }
    }
}