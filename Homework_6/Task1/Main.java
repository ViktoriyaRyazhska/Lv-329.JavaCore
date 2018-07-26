package Task1;

public class Main {
    public static void main(String args[]) {
        Bird[] bird = {
                new Eagle("black", false),
                new Swallow("gray", true),
                new Chicken("red", true),
                new Penguin("white-black", false)};

        for (Bird aBird : bird) {
            System.out.println(aBird.toString());
        }
    }
}
