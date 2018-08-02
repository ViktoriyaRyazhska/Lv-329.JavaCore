package Task1;

public class MyThread extends Thread {

    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i=0; i<5; i++)
        System.out.println(message);
    }

}
