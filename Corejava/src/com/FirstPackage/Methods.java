package com.FirstPackage;

public class Methods {
	static void method1() {
		Methods m1=new Methods();
		m1.method2();
		System.out.println("Method1 called..");
	}
	void method2() {
		method3();
		System.out.println("Method2 called..");
	}
	static void method3() {
		Methods m2=new Methods();
		m2.method4();
		System.out.println("Method3 called..");
	}
	void method4() {
		method5();
		System.out.println("Method4 called..");
	}
	static void method5() {
		Methods m3=new Methods();
		m3.method6();
		System.out.println("Method5 called..");
	}
	void method6() {
		method7();
		System.out.println("Method6 called..");
	}
	static void method7() {
		Methods m4=new Methods();
		m4.method8();
		System.out.println("Method7 called..");
	}
	void method8() {
		method9();
		System.out.println("Method8 called..");
	}
	static void method9() {
		Methods m5=new Methods();
		m5.method10();
		System.out.println("Method9 called..");
	}
	void method10() {
		System.out.println("Method10 called..");
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		method1();
		System.out.println("Main method ended");
	}

}
