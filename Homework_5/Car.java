public class Car {
    private String type;
    private int yearOfProduktion;
    private double engineCapacity;

    public Car() {
    }

    public Car(String type, int yearOfProduktion, double engineCapacity) {
        this.type = type;
        this.yearOfProduktion = yearOfProduktion;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduktion() {
        return yearOfProduktion;
    }

    public void setYearOfProduktion(int yearOfProduktion) {
        this.yearOfProduktion = yearOfProduktion;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return getType() + " " + getYearOfProduktion() + " " + getEngineCapacity();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return yearOfProduktion == car.yearOfProduktion;
    }

    @Override
    public int hashCode() {
        return yearOfProduktion;
    }
}
