package Task1;

public class Chicken extends NonFlyingBird {
    final String NAME = "Chicken";

    public Chicken(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    public String getName() {
        return NAME;
    }

    @Override
    public String toString() {
        return this.NAME + " can fly(" + fly() + "), " + this.NAME + " have " + this.getFeathers() + " feathers and lay eggs(" + this.isLayEggs() + ").";
    }
}