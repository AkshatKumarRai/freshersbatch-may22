package com.capgemini.java11;

/*
 * assignment 02
*/
public class VarKeyword {
	
	// var globlaScope = "we cannot use in global scope";
	/*
	 * we cannot use var key word in global scope as it is designed for local variable type inference
	 * 
	 * we can use in functional interface 
	 * 
	 * in case we have two parameters in lambda function we have to use for both but we cannot use for only for one.
	 * 
	 * 
	 * 	
	*/

	public static void main(String[] args) {
		
		
		
		var intValue = 123;  	// integer value
		var str = "name";		// String value
		var doubleValue = 10.11;// double value
		var boolValue = true;   // boolean value
		var charValue = 'a';    // charecter value
		
		System.out.println(intValue);
		System.out.println(str);
		System.out.println(doubleValue);
		System.out.println(boolValue);
		System.out.println(charValue);
		

	}

}
