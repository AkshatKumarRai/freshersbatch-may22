package com.capgemini.generics;

import java.util.HashSet;

public class EmployeeManager {
	public static void main(String[] args) {
		Employee emp1 = new Employee(1001,"akshat",21000,"BA");
		Employee emp2 = new Employee(1002,"shreya",21000,"HR");
		Employee emp3 = new Employee(1003,"naveen",21000,"Technical");
		Employee emp4 = new Employee(1004,"ayush",21000,"non-Technical");
		
		HashSet<Employee> hashset = new HashSet<>();
		
		hashset.add(emp1);
		hashset.add(emp2);
		hashset.add(emp3);
		hashset.add(emp4);
		
		for (Employee employee : hashset) {
			System.out.println(employee.toString());
		}
		
		
	}
}
class Employee {

	int id;
	String name;
	double salary;
	String department;
	
	

	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public void displayDetails() {
		System.out.println("Employee id is : "+ id);
		System.out.println("Employee name is :"+ name);
		System.out.println("Employee salary :"+ salary);
		System.out.println("Employee department is :"+ department);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
}
