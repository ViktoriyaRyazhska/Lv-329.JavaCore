package com.mak_keywa;

public class MainL4Ex2 {

	public static void main(String[] args) {
		Dog d1 = new Dog("name1", breed.Bulldog, 3);
		Dog d2 = new Dog("name2", breed.Spaniel, 2);
		Dog d3 = new Dog("name3", breed.Bulldog, 4);
		if (d1.checksamename(d2) || d2.checksamename(d3) || d3.checksamename(d1)) {
			System.out.println("There are two dogs with same name");
		} else {
			System.out.println("There are not two dogs with same name");
		}
		if(d1.age>d2.age) {
			if(d1.age>d3.age) {
				System.out.println("The oldest dog's name is "+d1.name+" and "+d1.Breed+".");
			}
			else {
				System.out.println("The oldest dog's name is "+d3.name+" and "+d3.Breed+".");
			}
		}
		else {
			if(d2.age>d3.age) {
				System.out.println("The oldest dog's name is "+d2.name+" and "+d2.Breed+".");
			}
			else {
				System.out.println("The oldest dog's name is "+d3.name+" and "+d3.Breed+".");
			}
		}
	}
}
