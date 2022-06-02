package com.capgemini.oops;

public class Rectangle extends Shapes {
	 int length;
	 int width;
	 Rectangle(int length,int width){
		 this.length=length;
		 this.width=width;
	 }
	 public void draw() {
		 int area=length*width;
		 System.out.println("Area of Rectangle : "+area);
	 }
}
