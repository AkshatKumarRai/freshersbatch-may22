package com.capgemini.oops;

public class Labour extends Employee {
	   int overTime=1000;
		
		
		Labour(String name,double salary,String designation){
			this.name=name;
			this.salary=salary;
			this.designation=designation;
			
		}
		 public void calculateSalary() {
			 salary=salary+this.overTime;
			 System.out.println("Employee name : "+name);
			 System.out.println("Employee designation : "+designation);
			 System.out.println("Employee total salary : "+salary);
		 }
}
