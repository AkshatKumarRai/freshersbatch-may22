package com.capgemini.oops;

import java.util.Scanner;

public class Display {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of Cube: ");
		int cu = sc.nextInt();
		System.out.print("Enter the length of Line: ");
		int li = sc.nextInt();
		System.out.print("Enter the length of Rectangle: ");
		int rl = sc.nextInt();
		System.out.print("Enter the width of Rectangle: ");
		int rb = sc.nextInt();
		
		Cube c=new Cube(cu);
		Line l=new Line(li);
		Rectangle r=new Rectangle(rl,rb);
		c.draw();
		l.draw();
		r.draw();

	}
}
