package com.FirstPackage;

public class StatInstance {

	//Static variables
	static String colName;
	static String loc;
	
	//Instance variables
	int rollno;
	String name;
	int mobile;
	String email;
	String branch;
	
	
	public static void main(String[] args) {
		//Accessing the static variables directly is possible inside the static method 
		//because it is a static void main()
		System.out.println("Accessing the static variables..");
		System.out.println(colName);
		System.out.println(loc);
		
		//Accessing the Instance variables inside the static method/block is not possible directly
		/*
		    System.out.println(rollno);
			System.out.println(name);
			System.out.println(mobile);
			System.out.println(email);
			System.out.println(branch);
		 */
		//When we are going to access these instance variables inside the static blocks
		//We need to create object for class. Syntax: ClassName objName=new className();
		System.out.println("Accessing the Instance variables..");
		StatInstance obj=new StatInstance();
		System.out.println(obj.rollno);
		System.out.println(obj.name);
		System.out.println(obj.mobile);
		System.out.println(obj.email);
		System.out.println(obj.branch);

	}

}
