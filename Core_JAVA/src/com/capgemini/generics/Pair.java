package com.capgemini.generics;

public class Pair<T,K> {

	   private T key;
	   private K value;
	   
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}
	public K getValue() {
		return value;
	}
	public void setValue(K value) {
		this.value = value;
	}

	public static void main(String[] args) 
	   {
		Pair<String,String> pair = new Pair<>();
		pair.setKey("1");
		pair.setValue("Hello");
		String s1 = pair.getKey();
		String s2 = pair.getValue();
		System.out.println(s1);
		System.out.println(s2);
		
		Pair<String, java.util.Date> pair1 = new Pair<>();
		pair1.setKey("Today is");
		pair1.setValue(new java.util.Date());
		String s3 = pair1.getKey();
		java.util.Date s4 = pair1.getValue();
		System.out.println(s3);
		System.out.println(s4);	   
	}
}
