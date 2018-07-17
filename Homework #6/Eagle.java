public class Eagle extends FlyingBird {
    private String feathers;
    private Integer layEggs;

    public Eagle() {
        this.feathers = "This bird do not have enough feathers for preservation of the population.";
        this.layEggs = 0;
    }
    public Eagle(String feathers, Integer layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }
    public void setLayEggs(Integer layEggs) {
        this.layEggs = layEggs;
    }
    public String getFeathers() {
        return feathers;
    }
    public Integer getLayEggs() {
        return layEggs;
    }

    @Override
    public String toString() {
        return "A bird " + this.getClass().getName() + ":\n■ Information about a feathers: " + feathers + "\n■ Information about an amount of laying an eggs: " + layEggs + ".\n■ " + fly();
    }
}