package com.vcube_assignments;

import java.util.Scanner;

public class Methods4Bank {
//	Starting balance of a customer
	static double balance=10000;
	public static void main(String[] args) {
//		Taking the input amount like deposit or withdrawal from user we can use Scanner class
		Scanner s= new Scanner(System.in);
//		Take some deposit amount from the user
		System.out.println("Enter Deposite Amount : ");
		double depamount=s.nextDouble();
//		Call the deposit() method and pass depamount as the argument
		deposit(depamount);
		System.out.println("Enter Withdrawal Amount : ");
//		Take some withdrawal amount from the user
		double withdraamount=s.nextDouble();
//		Call the withdrawal() method and pass withdraamount as the argument
		withdrawal(withdraamount);
	}
	
//	Display balance in console
	public static void showBalance() {
		System.out.println("Dear Customer Your Current Balance is "+balance);
	}
	
//	After deposit some amount how it will be added to the account and display the balance
	static void deposit(double amount) {
//		Adding the deposited amount to the current balance
		balance+=amount;
		System.out.println("Successfully Deposited!");
//		For displaying the current balance we can call the shoBalance()
		showBalance();
	}
	
//	After Withdraw certain amount how it will be deducted from the account balance
	static void withdrawal(double amount) {
//		For deducting the amount from the balance we can decrease the amount from balance
		balance-=amount;
		System.out.println("Successfully completed Money Withdraw!");
//		For displaying the current balance we can call the shoBalance()
		showBalance();
	}
}
