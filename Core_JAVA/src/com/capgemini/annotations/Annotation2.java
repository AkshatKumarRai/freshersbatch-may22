package com.capgemini.annotations;

@interface info {
	int AuthorId();

	String Author();

	String Supervisor();

	String date();

	String time();

	double version();

	String discription();
}

@info(AuthorId = 546, Author = "akshat", Supervisor = "kumar", date = "22-4-2022", time = "9;30 am", version = 2.0, discription = "used to provide information")
public class Annotation2 {
	@info(AuthorId = 546, Author = "akshat", Supervisor = "kumar", date = "22-4-2022", time = "9;30 am", version = 2.0, discription = "used to provide information")
	Annotation2() {

		System.out.println("annotations on constructor");
	}

	@info(AuthorId = 546, Author = "akshat", Supervisor = "kumar", date = "22-4-2022", time = "9;30 am", version = 2.0, discription = "used to provide information")
	public void information() {
		System.out.println("annotations on methods");
	}

	public static void main(String[] args) {

		Annotation2 a1 = new Annotation2();
		a1.information();
	}

}
