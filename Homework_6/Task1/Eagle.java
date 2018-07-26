package Task1;

public class Eagle extends FlyingBird {
    final String NAME = "Eagle";

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return this.NAME + " can fly(" + fly() + "), " + this.NAME + " have " + this.getFeathers() + " feathers and lay eggs(" + this.isLayEggs() + ").";
    }
}
