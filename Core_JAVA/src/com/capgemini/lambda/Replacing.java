package com.capgemini.lambda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

/*
 * assignment 06
*/
public class Replacing {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JavaScript");
		list.add("TypeScript");
		list.add("MongoDb");
		list.add("Github");
		System.out.println("Contents of the list: " + list);
		list.replaceAll(new Op());
		System.out.println("Contents of the list after replace operation: \n" + list);
	}

}

class Op implements UnaryOperator<String> {
	public String apply(String str) {
		return str.toUpperCase();
	}
}