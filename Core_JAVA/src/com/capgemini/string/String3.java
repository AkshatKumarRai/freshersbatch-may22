package com.capgemini.string;

public class String3 {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		 System.out.println(str.toLowerCase());
		 System.out.println(str.toUpperCase());
		 System.out.println(str.replace('a','$'));
		 String str2="collection";
		 System.out.println(str.contains(str2));
		 String str1="java string pool refers to collection of strings which are stored in heap memory";
		 System.out.println(str.equals(str1));
		 System.out.println(str.equalsIgnoreCase(str1));
		 
		 

	}

}
