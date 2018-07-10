package com.mak_keywa;

public class Dog {

	String name;
	breed Breed;
	int age;

	Dog(String name, breed Breed, int age) {
		this.name = name;
		this.Breed = Breed;
		this.age = age;
	}

	public static void main(String[] args) {

	}

	public boolean checksamename(Dog d) {
		if (this.name == d.name)
			return true;
		else
			return false;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public breed getBreed() {
		return Breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBreed(breed breed) {
		Breed = breed;
	}

}

enum breed {
	Bulldog, Spaniel, Terrier
}