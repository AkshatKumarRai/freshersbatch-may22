package com.capgemini.string;

public class StringBuffer3 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("This  method returens the reserved object on which it was called");
		System.out.println(str);
		str.reverse();
		System.out.println(str);
	}

}
