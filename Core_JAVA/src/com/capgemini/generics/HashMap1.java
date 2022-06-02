package com.capgemini.generics;

import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap<Integer,Double> h = new HashMap<Integer,Double>();
		
		// put() is used to add key and value inside Map
		h.put(10, 12.33);
		h.put(20, 10.45);
		h.put(30, 15.33);
		h.put(40, 16.45);
		h.put(50, 16.33);
		h.put(60, 17.25);
		h.put(70, 18.78);
		h.put(80, 19.85);
		h.put(90, 19.65);
		h.put(100, 20.12);
		System.out.println(h);
}
}
