package com.capgemini.data_structure;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numArray = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 86, 47 };

		System.out.println("Array Before swapping :");
		for (int i : numArray) {
			System.out.print(i + ",");
		}

		int n = numArray.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (numArray[j - 1] > numArray[j]) {
					temp = numArray[j - 1];
					numArray[j - 1] = numArray[j];
					numArray[j] = temp;
				}

			}
		}
		System.out.println();
		System.out.println("Array After swapping :");
		
		for (int i : numArray) {
			System.out.print(i+",");
		}
	}

}
