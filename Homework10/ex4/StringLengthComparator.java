package com.mak_keywa;

import java.util.Comparator;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String str1, String str2) {
		return str2.length() - str1.length();
	}
}