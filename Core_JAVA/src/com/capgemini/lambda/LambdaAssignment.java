package com.capgemini.lambda;

@FunctionalInterface
interface Arithmetic{
	int operations(int a,int b);
}

public class LambdaAssignment {
	public static void main(String[] args) {
		Arithmetic addition = new Arithmetic()
		{
			@Override
			public int operations(int a,int b){
				return (a+b);
			}
		};
		
		
		Arithmetic subtract = new Arithmetic()
		{
			@Override
			public int operations(int a,int b){
				return (a-b);
			}
		};
		

		Arithmetic multiply = new Arithmetic()
		{
			@Override
			public int operations(int a,int b){
				return (a*b);
			}
		};
		

		Arithmetic divide = new Arithmetic()
		{
			@Override
			public int operations(int a,int b){
				return (a/b);
			}
		};
		
		
		System.out.println("Addition " + addition.operations(10,20));
		System.out.println("Subtraction " + subtract.operations(40,20));
		System.out.println("Divide " + divide.operations(100,20));
		System.out.println("Multiply " + multiply.operations(2,2));

	}
	
}
