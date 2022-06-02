package com.capgemini.data_structure;

import java.util.Scanner;

public class SimpleAndCompoundInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the priciple amount :");
		
		
		float pAmount = sc.nextFloat();// principle amount
		float rate = 2;
		float time =6;
		
		float si = (pAmount*rate*time)/100;//simple interest formula
		System.out.println("Simple Interest is : "+si);
		
		float ci = (float)(pAmount*Math.pow(1+rate/100,time));
		
		System.out.println("Compound Interest is : "+ci);
	}

}
