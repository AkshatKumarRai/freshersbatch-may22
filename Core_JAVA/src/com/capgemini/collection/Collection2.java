package com.capgemini.collection;

import java.util.HashSet;

public class Collection2 {
	public static void main(String[] args){
	
	HashSet hs=new HashSet();
	hs.add("oppo");
	hs.add("redmi");
	hs.add("apple");
	hs.add("lumia");
	hs.add("nokia");
	hs.add("moto");
	hs.add("sony");
	hs.add("realme");
	hs.add("boat");
	hs.add("jio");
	
	System.out.println(hs);
	
	hs.add("moto");
	System.out.println(hs);
	}
}
