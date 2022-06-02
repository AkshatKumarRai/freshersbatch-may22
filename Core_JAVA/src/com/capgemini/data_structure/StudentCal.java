package com.capgemini.data_structure;

import java.util.Scanner;

public class StudentCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student_1 marks in subject A and B and C");
		int stu1A = sc.nextInt();
		int stu1B = sc.nextInt();
		int stu1C = sc.nextInt();
		
		System.out.println("Enter the student_2 marks in subject A and B and C");
		
		int stu2A = sc.nextInt();
		int stu2B = sc.nextInt();
		int stu2C = sc.nextInt();
		
		System.out.println("Enter the student_3 marks in subject A and B and C");
		
		int stu3A = sc.nextInt();
		int stu3B = sc.nextInt();
		int stu3C = sc.nextInt();
		
		float totalMarks = stu1A+stu1B+stu1C+stu2A+stu2B+stu2C+stu3A+stu3B+stu3C;
		
		float avgMarks = totalMarks/9;
		System.out.println("Total marks of All students is : "+totalMarks);
		System.out.println("Average marks of all students is : "+avgMarks);
		System.out.println();
		
		int stu_1_Marks = stu1A+stu1B+stu1C;
		float stu_1AvgMarks = stu_1_Marks/3;
		System.out.println("Total marks of student_1 is : "+stu_1_Marks);
		System.out.println("Average marks students_1 is : "+stu_1AvgMarks);
		System.out.println();
		
		int stu_2_Marks = stu2A+stu2B+stu2C;
		float stu_2AvgMarks = stu_2_Marks/3;
		System.out.println("Total marks of student_2 is : "+stu_2_Marks);
		System.out.println("Average marks students_2 is : "+stu_2AvgMarks);
		System.out.println();
		
		int stu_3_Marks = stu3A+stu3B+stu3C;
		float stu_3AvgMarks = stu_3_Marks/3;
		System.out.println("Total marks of student_2 is : "+stu_3_Marks);
		System.out.println("Average marks students_2 is : "+stu_3AvgMarks);
				
		
		sc.close();
	}

}
