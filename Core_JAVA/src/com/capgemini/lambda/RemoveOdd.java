package com.capgemini.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/*
 * assignment 04
*/
public class RemoveOdd {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(
				Arrays.asList("a", "abbb", "abc", "ab", "cde", "defg", "abcd", "eee"));

		Predicate<String> filter = str -> (str.length() % 2 == 1);

		System.out.println("Original ArrayList          : " + arrayList);
		boolean value = arrayList.removeIf(filter);
		System.out.println("Returned value : " + value);
		System.out.println("ArrayList after removeIf()  : " + arrayList);
	}
}
