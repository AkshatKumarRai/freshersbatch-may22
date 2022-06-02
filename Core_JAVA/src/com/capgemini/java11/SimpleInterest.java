package com.capgemini.java11;

public class SimpleInterest {
	public static void main(String[] args) {
		SI obj = (var P, var T, var R)-> (P*T*R)/100;
		System.out.println("SimpleIntrest: "+obj.operation(12000,5,5));
	}
}
interface SI{
	int operation(int P, int T, int R);
}

