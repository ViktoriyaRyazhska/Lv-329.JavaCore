public class Dog {
    private String name;
    private String breed;
    private Integer age;

    public Dog() {}
    public Dog(String name, String breed, Integer age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public Integer getAge() {
        return age;
    }

    enum breed {
        NoBreed, Breed1, Breed2, Breed3
    }
}
