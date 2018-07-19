package com.mak_keywa;

import java.util.*;

public class MainL7Ex1 {
	public static void main(String[] args) {
		Set<String> input1 = new TreeSet<>();
		input1.add("abc");
		input1.add("def");
		input1.add("ghi");
		input1.add("jkl");
		input1.add("mno");
		Set<String> input2 = new TreeSet<>();
		input2.add("123");
		input2.add("456");
		input2.add("789");
		input2.add("ghi");
		input2.add("jkl");
		union(input1, input2);
		intersect(input1, input2);
	}

	static void union(Set<String> set1, Set<String> set2) {
		set1.addAll(set2);
		System.out.println(set1);
	}

	static void intersect(Set<String> set1, Set<String> set2) {
		set1.retainAll(set2);
		System.out.println(set1);
	}
}
