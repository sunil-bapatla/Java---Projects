package com.javaintro;

public class Sunil {
	
	static int counts = 0;{
		{
		Sunil.counts++;	
		 
		}
	}
	public static void main(String[] args) {
		
		System.out.println("main method started");
		
		Sunil s1 = new Sunil ();
		Sunil s2 = new Sunil ();
		System.out.println(counts);

		System.out.println("main method ended");
		
	}

}
