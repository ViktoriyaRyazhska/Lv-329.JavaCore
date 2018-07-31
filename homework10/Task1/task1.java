package homework10.Task1;

public class task1 {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread("Thread1");
        MyThread thread2 = new MyThread("Thread2");
        MyThread thread3 = new MyThread("Thread3");
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){

            System.out.printf("has been interrupted");
        }
        thread3.start();

    }
}

class MyThread extends Thread {

    MyThread(String name){
        super(name);
    }

    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.printf("%s count " + (i+1) + "\n", Thread.currentThread().getName());
        }

    }
}