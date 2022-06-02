package com.capgemini.string;

public class StringBuffer2 {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("It is used to _ at the specified index position");
		System.out.println(str);
		str.delete(14, 15);
		str.insert(14,"insert text");
		System.out.println(str);
	}

}
