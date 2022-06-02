package com.capgemini.string;

public class StringBuilder2 {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("It is used to _ at the specified index position");
		System.out.println(str);
		str.delete(14, 15);
		str.insert(14,"insert text");
		System.out.println(str);
	}

}
