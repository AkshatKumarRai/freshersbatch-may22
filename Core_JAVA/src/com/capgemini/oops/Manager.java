package com.capgemini.oops;

public class Manager extends Employee {
	 int incentive=3000;
	 
		Manager(String name,double salary,String designation){
			this.name=name;
			this.salary=salary;
			this.designation=designation;
		}
		public void calculateSalary() {
			salary=salary+this.incentive;
			 System.out.println("Employee name : "+name);
			 System.out.println("Employee designation : "+designation);
			 System.out.println("Employee total salary : "+salary);
		}
}
