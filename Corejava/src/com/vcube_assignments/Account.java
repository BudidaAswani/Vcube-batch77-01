package com.vcube_assignments;
/* 18-08-2026
 * ----------
 	Create Account class for maintaining ATM Account System
 	Required Fields
 	- Customer Name
 	- Account Number
 	- Balance
 	- Account Status
 	Account number should generate automatically
 	Display 3 persons account details
 */
public class Account {
	static String accno;
	String cname;
	float bal;
	String accStatus;
	void display(String cname,float bal,String status) {
		System.out.println("Account holder : "+cname);
		System.out.println("Account Number : "+accno);
		System.out.println("Account Balance : "+bal);
		System.out.println("Account Status : "+status);
	}
	public static void main(String[] args) {
		Account a1=new Account();
		accno="714O6324";
		System.out.println("**************************");
		a1.display("Budida Aswani", 44346, "Active");
		Account a2=new Account();
		accno="714O6324";
		System.out.println("**************************");
		a2.display("Ram Kumar", 784392, "Active");
		Account a3=new Account();
		accno="714O6324";
		System.out.println("**************************");
		a3.display("Jaya Ramudu", 23098, "InActive");
	}

}
