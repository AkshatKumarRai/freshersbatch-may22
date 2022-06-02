package com.capgemini.oops;

public class MainClass {
	 public static void main(String[] args) 
	  {
		 
		  Persistence persistence=new FilePersistence();
			persistence.persist();
			
			Persistence persistence1=new DataPersistence();
			persistence1.persist();
		}
	}

