package com.capgemini.collection;

import java.util.TreeMap;

public class Contact implements Comparable<Contact> {
    Long phoneNumber;
    String name;
    String email;
	char gender;
	public Contact(long phoneNumber, String name, String email, char gender) 
	{
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString()
	{
		return "PhoneNumber:"+phoneNumber+" Name:"+name+" Email:"+email+" Gender:"+gender;
	}
	@Override
	public int compareTo(Contact o) 
	{
		return  this.phoneNumber.compareTo(o.phoneNumber);
	}
	public static void main(String[] args) 
	{
		Contact c1=new Contact(963276007, "Akshat", "akshat@gmail.com",'M' );
		Contact c2=new Contact(963276005, "Awani", "awani@gmail.com",'F' );
		Contact c3=new Contact(963276008, "Ayush", "ayush@gmail.com",'M' );
		TreeMap<Long, Contact> t=new TreeMap<>();
		
		t.put((long) 963276007,c1);
		t.put((long) 963276005,c2 );
		t.put((long) 963276008,c3 );
		
		System.out.println(t.keySet());
		System.out.println(t.values());
		System.out.println(t);
	}
}
