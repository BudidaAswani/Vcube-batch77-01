package com.vcube_assignments;
/* 18-08-2026
 * ---------
 	A company wants to store employee information.
	Create an Employee class with:
		Employee ID
		Employee name
		Salary
		Experience
		Grade
		Permanent status
	Use appropriate primitive data types wherever possible.
	Create 3 employee objects and display their details.
 */
public class Employee {
	
	int eId;
	String ename;
	int sal;
	float exp;
	char grade;
	boolean PermanantStatus;
	
	void EmpDetails(){
		System.out.println("Employee Id : "+eId);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Salary : "+sal);
		System.out.println("Employee Number of Year's Experince is "+exp);
		System.out.println("Grade : "+grade);
		System.out.println("Employee Permanant Status is "+PermanantStatus);
	}
	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.eId=101;
		e1.ename="Jaya Ramudu";
		e1.sal=35000;
		e1.exp=2.5f;
		e1.grade='A';
		e1.PermanantStatus=false;
		e1.EmpDetails();
		Employee e2=new Employee();
		e2.eId=102;
		e2.ename="Manyutheswari";
		e2.sal=32000;
		e2.exp=0.5f;
		e2.grade='B';
		e2.PermanantStatus=false;
		e2.EmpDetails();
		Employee e3=new Employee();
		e3.eId=103;
		e3.ename="Ramya";
		e3.sal=25000;
		e3.exp=1.5f;
		e3.grade='B';
		e3.PermanantStatus=false;
		e3.EmpDetails();
	}

}
