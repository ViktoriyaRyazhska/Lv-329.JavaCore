package Task1;

public class FlyingBird extends Bird {

    FlyingBird(String  feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public boolean fly() {
        return true;
    }
}
