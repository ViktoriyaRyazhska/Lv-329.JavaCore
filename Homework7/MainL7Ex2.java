package com.mak_keywa;

import java.util.*;

public class MainL7Ex2 {

	private static Map<String, String> personMap;
	private static Map<String, String> personMapwithout;

	public static void main(String[] args) {
		personMap = new HashMap<>();
		personMapwithout = new HashMap<>();
		personMap.put("Lastname1", "Firstname1");
		personMap.put("Lastname2", "Firstname2");
		personMap.put("Lastname3", "Firstname3");
		personMap.put("Lastname4", "Firstname4");
		personMap.put("Lastname5", "Firstname2");
		personMap.put("Lastname6", "Firstname2");
		personMap.put("Lastname7", "Firstname5");
		personMap.put("Lastname8", "Firstname6");
		personMap.put("Lastname9", "Firstname7");
		personMap.put("Lastname10", "Firstname2");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (entry.getValue() != "Firstname2") {
				personMapwithout.put(entry.getKey(), entry.getValue());
			}

		}
		for (Map.Entry<String, String> entry : personMapwithout.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
