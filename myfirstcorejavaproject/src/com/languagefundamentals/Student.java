package com.languagefundamentals;

public class Student {
	
	int roll_number ;
	String Name;
	double salary;
	
	void Read () {
		System.out.println("Read Method Called");
	}
	void write () {
		System.out.println("Write Method Called ");
	}

	public static void main(String[] args) {
		Student s1 = new Student ();
		
		System.out.println(s1.roll_number);
		System.out.println(s1.Name );
		System.out.println(s1.salary);
		s1. Read ();
		s1. write ();
		
		

	}

}
