import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Persons {

	private String name;
	private int birthYear;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return birthYear;
	}
	public void setAge(int age) {
		this.birthYear = age;
	}
	public Persons(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}
	public Persons() {}


public void inputInfo() throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter name new Person: ");
	this.name = br.readLine();
	System.out.println("Enter birth Year new Person: ");
	this.birthYear = Integer.parseInt(br.readLine());		
}
public int age() {
	age = 2018 - birthYear;
	System.out.println("Age " + name + ": " + age);
	return age;
}	
public void outputInfo() {
		System.out.println("Name: " + name + ", birth year: "+ birthYear);
}
public void changeName(String name) {
	this.name = name;
}


@Override
	public String toString() {
		return "Persons [name=" + name + ", birthYear=" + birthYear + ", getName()=" + getName() + ", getAge()="
				+ getAge() + "]";
	}
public static void main(String[] args) throws IOException {
	Persons p1 = new Persons("Bogdan", 1991);
    Persons p2 = new Persons("Yulia", 1993);
    Persons p3 = new Persons("Vadim", 1988);
    Persons p4 = new Persons("Volodya", 1992);
    Persons p5 = new Persons("Vika",1996);
    Persons p6 = new Persons();
    p1.age();
    p2.age();
    p3.age();
    p4.age();
    p5.age();
    p6.inputInfo();
    p1.outputInfo();
    p2.outputInfo();
    p3.outputInfo();
    p4.outputInfo();
    p5.outputInfo();
    p6.outputInfo();
   } 	
}

