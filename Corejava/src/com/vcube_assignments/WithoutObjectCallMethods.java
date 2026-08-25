package com.vcube_assignments;

import com.FirstPackage.Methods;

/* 19-08-2026
 * ----------
 Q)	Write a Java Program to Complete Below requirements 
	- Take 4 methods 4 instance methods 
	- do not create any object in main and also in class level not in any method 
	- but when we execute the class all the data should print automatically
 A)  Firstly understand the question carefully.
 		The question is " Without creating objects in main method, class level, and also methods "
 	  So, We can think twice and answer the question. Then the answer is to create object any where except class level, main method level, and method level.
 	  So, Can create objects in Blocks Like instance blocks, static blocks.
 	  So, think without creating objects we can not call instance methods.
 	  So, without creating objects static blocks can executed before main method
 	  so, The answer is to make static block and call methods inside static block and create objects inside static blocks also.
 */
public class WithoutObjectCallMethods {
	static void method1() {
		method3();
		System.out.println("Static Method1 called..");
	}
	void method2() {
		System.out.println("Instance Method2 called..");
	}
	static void method3() {
		method5();
		System.out.println("Static Method3 called..");
	}
	void method4() {
		System.out.println("Instance Method4 called..");
	}
	static void method5() {
		method7();
		System.out.println("Static Method5 called..");
	}
	void method6() {
		System.out.println("Instance Method6 called..");
	}
	static void method7() {
		System.out.println("Static Method7 called..");
	}
	void method8() {
		System.out.println("Instance Method8 called..");
	}
	// First Static blocks are execute
	static {
		WithoutObjectCallMethods obj=new WithoutObjectCallMethods();
		obj.method2();
		obj.method4();
		obj.method6();
		obj.method8();
	}
	public static void main(String[] args) {
		method1();
		System.out.println("<Main method started>");
		System.out.println("<Main method ended>");
	}

}
