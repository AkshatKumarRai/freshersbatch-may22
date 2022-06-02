package com.capgemini.oops;

public class Organization {
	public static void main(String[] args) {
		Labour l=new Labour("Akshat",15000,"Labour");
		Manager m=new Manager("Kumar",30000,"Manager");
		l.calculateSalary();
		m.calculateSalary();
	}
}
