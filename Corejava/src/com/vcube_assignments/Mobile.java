package com.vcube_assignments;
/* 17-08-2026
 * ----------
 	A mobile company wants to store phone details.
	Create a Mobile class with:
		brand,model,price,ram
	Use 
		Static variable
		Instance variables
		Static block
		Instance block
		Static method
		Instance method
	Object creation
	Create 3 mobile objects and display their information.
 */
public class Mobile {
	static String brand;
	String model;
	int price;
	String ram;
	static int count=0;
//	auto int num;
	static {
		
	}
	
	{
		count++;
	}
	
	static void brandDetails(String brand1) {
		System.out.println("Mobile brand \t: "+brand1);
	}
	void modelDetails(String model,int price, String ram) {
		System.out.println("Model\t\t: "+model);
		System.out.println("Price\t\t: "+price);
		System.out.println("Ram\t\t: "+ram);
	}
	public static void main(String[] args) {
		brand="Redmi";
		Mobile m1=new Mobile();
		System.out.println("******************************");
		brandDetails(brand);
		m1.modelDetails("RedmiNote10S",56000,"8GB");
		Mobile m2=new Mobile();
		System.out.println("******************************");
		brandDetails("OppO");
		m2.modelDetails("OppO12S",44000,"6GB");
		Mobile m3=new Mobile();
		System.out.println("******************************");
		brandDetails("IPhone");
		m3.modelDetails("IPhone25i",550000,"16GB");
		System.out.println("****************************");
		System.out.println("In the Mobile Class We have "+count+" Mobile details");
	}

}
