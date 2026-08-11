package com.FirstPackage;

public class FirstProgram {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
		System.out.println(Class.forName("java.lang.String"));
	}

}
