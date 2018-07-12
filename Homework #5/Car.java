public class Car {
    private String type;
    private Integer yearOfProduction;
    private Double engineCapacity;

    public Car() {}
    public Car(String type, Integer yearOfProduction, Double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    public String getType() {
        return type;
    }
    public Integer getYearOfProduction() {
        return yearOfProduction;
    }
    public Double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car:\n■ Type: " + type + ".\n■ Year of production: " + yearOfProduction + ".\n■ Engine capacity: " + engineCapacity + ".\n";
    }
}
