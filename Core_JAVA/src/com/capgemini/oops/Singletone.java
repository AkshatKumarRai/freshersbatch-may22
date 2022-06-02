package com.capgemini.oops;

public class Singletone {
	private static Singletone a = null;

	private Singletone() 
	{
		System.out.println("Object Created");
	}

	public static void createObject()
	{
		if(a==null)
		{
			a = new Singletone();
		}
		else
		{
			System.out.println("Cannot Create");
		}
	}
	
	public static void main(String[] args) 
	{
		Singletone.createObject();
		Singletone.createObject();
		Singletone.createObject();	
	}
}
