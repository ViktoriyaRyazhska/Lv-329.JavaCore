import java.time.LocalDate;

public class Person {
    private String name;
    private Integer birthYear;

    public Person() {}
    public Person(String name, Integer birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }
    public String getName() {
        return name;
    }
    public Integer getBirthYear() {
        return birthYear;
    }

    public Integer age() {
        Integer variable = LocalDate.now().getYear();
        return variable - birthYear;
    }
    public void input(String name, Integer birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public String output() {
        return "Person name is " + this.name + ".\nYear of person's birth: " + birthYear + ".";
    }
    public String changeName(String name) {
        return this.name = name;
    }
}