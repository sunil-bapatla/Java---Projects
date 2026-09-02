package com.javaintro;

public class BankAccount {
	int Accno;
	String AccHolderName;
	double balance;
	
	static int accNoGenarator =2000;
	{
	 BankAccount.accNoGenarator++;
	}

	public static void main(String[] args) {
	
		 
		 
		BankAccount b1 = new BankAccount ();
		b1.Accno=  accNoGenarator;
		b1.AccHolderName= "akhil";
		b1.balance= 2000;
		
		BankAccount b2 = new BankAccount ();
		
		b2.Accno=  accNoGenarator;
		b2.AccHolderName= "ravi";
		b2.balance= 3000;
		 
		BankAccount b3 = new BankAccount ();
		
		b3.Accno=  accNoGenarator;
		b3.AccHolderName= "rahul";
		b3.balance= 4000;
		
		System.out.println(b1.Accno);
		System.out.println(b1.AccHolderName);
		System.out.println(b1.balance);
		 
		System.out.println("***************************");
	
		
		System.out.println(b2.Accno);
		System.out.println(b2.AccHolderName);
		System.out.println(b2.balance);
		System.out.println("***************************");
		 
		System.out.println(b3.Accno);
		System.out.println(b3.AccHolderName);
		System.out.println(b3.balance);
		System.out.println("***************************");
		 
	


	}

}
