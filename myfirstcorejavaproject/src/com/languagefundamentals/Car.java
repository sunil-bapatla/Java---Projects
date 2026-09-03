package com.languagefundamentals;

public class Car {
	
	int carNumber;
	String carName ;
	double Price;
	
	void start () {
		   
		System.out.println("Car Started");
	}
	void stop (){
		System.out.println("Car Stoped");
	}

	public static void main(String[] args) {
		 Car c1 = new Car ();
		 
		 System.out.println(c1.carNumber);
		 System.out.println(c1.carName);
		 System.out.println(c1.Price);
		 
		 
		c1.start();
		c1.stop();
		

	}

}
