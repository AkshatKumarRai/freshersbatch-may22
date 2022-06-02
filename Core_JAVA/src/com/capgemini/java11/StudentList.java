package com.capgemini.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


public class StudentList {
	public static void main(String[] args) {
		var path = "C:\\Users\\akrai\\eclipse-workspace\\Core_JAVA\\src\\com\\capgemini\\java11\\StudentList.txt";
		try {
						
			String data = Files.readString(Path.of(path)); // reading the text file 
			
			System.out.println(data);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}