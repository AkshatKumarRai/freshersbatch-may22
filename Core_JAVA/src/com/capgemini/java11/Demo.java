package com.capgemini.java11;
import java.util.ArrayList;
import java.util.Arrays;
public class Demo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("quick");
		list.add("brown");
		list.add("fox");
		list.add("jumps");
		list.add("over");
		list.add("the");
		list.add("lazy");
		list.add("dog");
		
	String[] arr = list.toArray(String[]::new);//size->new String[size]==String[]::new
	System.out.println(Arrays.toString(arr));
	}	
}
