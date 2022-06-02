package com.capgemini.collection;

import java.util.TreeMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set; 

public class Collection1 {

	public static void main(String[] args) {
	
		TreeMap<Long, String> tm=new TreeMap<Long,String>(Collections.reverseOrder());
		tm.put(9877894316L, "Ayush");
		tm.put(9896546465L, "Awani");
		tm.put(9834513542L, "Shreya");
		tm.put(9846544456L, "Rinshu");
		tm.put(9886746444L, "Mohan");
		
		//System.out.println();
		System.out.println(tm);
		Set<Long> k=tm.keySet();
		System.out.println(k);
		
		Collection<String> values = tm.values();
		System.out.println(values);
	
		Set<Map.Entry<Long, String>> entries = tm.entrySet();
		System.out.println(entries);
	}
}
	

