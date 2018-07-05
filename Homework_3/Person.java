import java.util.Calendar;


public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void age() {
        Calendar c = Calendar.getInstance();
        System.out.println(this.getName() + " is " + (c.get(Calendar.YEAR) - birthYear) + " years old.");
    }

    public void input(String s, int i) {
        this.setName(s);
        this.setBirthYear(i);
    }

    public void output() {
        System.out.println("Name : " + this.getName());
        System.out.println("Age  : " + this.getBirthYear());
    }

    public void changeName(String s) {
        this.setName(s);
    }
}
