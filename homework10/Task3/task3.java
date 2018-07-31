package homework10.Task3;

public class task3 {
    public static void main(String[] args) {

        MyThread1 mh1 = new MyThread1();
        mh1.start();
    }
}

class MyThread1 extends Thread {

    public void run(){
        MyThread2 th2 = new MyThread2();
        th2.start();
    }
}

class MyThread2 extends Thread {

    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread 2");
        }
        MyThread3 th3 = new MyThread3();
        th3.start();
    }
}

class MyThread3 extends Thread {

    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 3");
        }
    }
}