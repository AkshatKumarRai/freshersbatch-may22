package com.capgemini.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * assignment 07
*/
public class Maptostring {
	public static void main(String[] args) {
		Map<String, Integer> lang = new HashMap<>();

		lang.put("C++", 1980);
		lang.put("Java", 1995);
		lang.put("Ruby", 1991);

		for (@SuppressWarnings("unused")
		Map.Entry<String, Integer> Set : lang.entrySet()) {

			String str = lang.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue())
					.collect(Collectors.joining("|"));

			System.out.println(str);
		}
	}
}