package com.capgemini.data_structure;

import java.util.Scanner;

public class MarksResults {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the subject_1 marks");
		int sub_1Marks = sc.nextInt();
		System.out.println("Enter the subject_2 marks");
		int sub_2Marks = sc.nextInt();
		System.out.println("Enter the subject_3 marks");
		int sub_3Marks = sc.nextInt();
		
		if((sub_1Marks>60)&&(sub_2Marks>60)&&(sub_3Marks>60)) {
			System.out.println("Student is passed");
		}else if((sub_1Marks>60&&(sub_2Marks>60))||(sub_1Marks>60&&(sub_3Marks>60))||(sub_3Marks>60&&(sub_2Marks>60))) {
			System.out.println("Student is promoted ");
		}else {
			System.out.println("Student is Failed");
		}
		sc.close();
	}

}
