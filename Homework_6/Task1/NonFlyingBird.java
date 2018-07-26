package Task1;

public class NonFlyingBird extends Bird {

    NonFlyingBird(String  feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        return false;
    }
}
