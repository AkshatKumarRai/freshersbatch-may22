package com.capgemini.data_structure;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Armstrong");
		
		int num= sc.nextInt();
		int temp = num;
		int rem,rev=0;
		while (num>0) {
			 rem= num%10;
			 rev = rev+rem*rem*rem;
			num=num/10;
		}
		if(rev==temp) {
			System.out.println(temp+" is a Armstrong number: ");
		}else {
			System.out.println(temp+ " is not a Armstrong number");
		}
		
		sc.close();
	}

}
