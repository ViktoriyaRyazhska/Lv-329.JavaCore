package com.mak_keywa;

public class MainL3Ex1 {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("name3", 1990);
		Person p4 = new Person("name4", 1992);
		Person p5 = new Person("name5", 1995);
		p1.setName("name1");
		p1.setBirthYear(1985);
		p2.input("name2", 1988);
		System.out.println(p1.output());
		System.out.println(p2.output());
		System.out.println(p3.output());
		System.out.println(p4.output());
		System.out.println(p5.output());
	}
}
