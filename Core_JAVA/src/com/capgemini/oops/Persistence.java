package com.capgemini.oops;

public abstract class Persistence {
	abstract void persist();
	
	}

	class FilePersistence extends Persistence 
	{

		@Override
		public void persist() 
		{
			System.out.println("File Persistence Running ");
			
		}
		
		
	}

	class DataPersistence extends Persistence 
	{

		@Override
		public void persist() 
		{
	          System.out.println("Data Persistence Running");
		
		}
}
