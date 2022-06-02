package com.capgemini.data_structure;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		int[] numArray = {5,12,14,6,78,19,1,23,26,35,37,7,86,47};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number in which you have to find ");
		int num = sc.nextInt();
		
		boolean isFound = false;
		
		for (int i : numArray) {
			if(i==num) {
				isFound = true;
				break;
			}
		}
		if(isFound) {
			System.out.println(num + " is present in the given array");
		}else {
			System.out.println(num+" is not present in the given array");
		}
	}

}
