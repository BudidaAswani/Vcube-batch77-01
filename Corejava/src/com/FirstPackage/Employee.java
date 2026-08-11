package com.FirstPackage;

public class Employee {
	static String deptName;
	static String loc;
	int empId;
	String name;
	String email;
	int mobile;
	
	public static void main(String[] args) {
		//3 employees one department
		System.out.println("---First Department Details---");
		deptName="MCA";
		loc="Tirupati";
		Employee e1=new Employee();
		e1.empId=101;
		e1.name="K. Usha Rani";
		e1.email="kusha123@gmail.com";
		e1.mobile=812345679;
		
		System.out.println("Employee one details*");
		System.out.println("Employee Department Name : "+deptName);
		System.out.println("Department Location : "+loc);
		System.out.println("Employee Id : "+e1.empId);
		System.out.println("Employee Name : "+e1.name);
		System.out.println("Employee Email Id : "+e1.email);
		System.out.println("Employee Mobile Number : "+e1.mobile);

	
		System.out.println("---Second Department Details---");
		deptName="MCA";
		loc="Tirupati";
		Employee e2=new Employee();
		e2.empId=102;
		e2.name="Prathyusha";
		e2.email="prathyusha123@gmail.com";
		e2.mobile=812285699;
		
		System.out.println("Employee one details*");
		System.out.println("Employee Department Name : "+deptName);
		System.out.println("Department Location : "+loc);
		System.out.println("Employee Id : "+e2.empId);
		System.out.println("Employee Name : "+e2.name);
		System.out.println("Employee Email Id : "+e2.email);
		System.out.println("Employee Mobile Number : "+e2.mobile);
		
		System.out.println("---Third Department Details---");
		deptName="MCA";
		loc="Tirupati";
		Employee e3=new Employee();
		e3.empId=103;
		e3.name="M. Usha Rani";
		e3.email="musha123@gmail.com";
		e3.mobile=882345679;
		
		System.out.println("Employee one details*");
		System.out.println("Employee Department Name : "+deptName);
		System.out.println("Department Location : "+loc);
		System.out.println("Employee Id : "+e3.empId);
		System.out.println("Employee Name : "+e3.name);
		System.out.println("Employee Email Id : "+e3.email);
		System.out.println("Employee Mobile Number : "+e3.mobile);
		
		//2 employees another department

		System.out.println("---Fourth Department Details---");
		deptName="Bio-technology";
		loc="Tirupati";
		Employee e4=new Employee();
		e4.empId=104;
		e4.name="Jyoshna";
		e4.email="jyoshna123@gmail.com";
		e4.mobile=912345679;
		
		System.out.println("Employee one details*");
		System.out.println("Employee Department Name : "+deptName);
		System.out.println("Department Location : "+loc);
		System.out.println("Employee Id : "+e4.empId);
		System.out.println("Employee Name : "+e4.name);
		System.out.println("Employee Email Id : "+e4.email);
		System.out.println("Employee Mobile Number : "+e4.mobile);
		
		System.out.println("---Fifth Department Details---");
		deptName="Bio-technology";
		loc="Tirupati";
		Employee e5=new Employee();
		e5.empId=105;
		e5.name="Kishori";
		e5.email="kishori123@gmail.com";
		e5.mobile=992345679;
		
		System.out.println("Employee one details*");
		System.out.println("Employee Department Name : "+deptName);
		System.out.println("Department Location : "+loc);
		System.out.println("Employee Id : "+e5.empId);
		System.out.println("Employee Name : "+e5.name);
		System.out.println("Employee Email Id : "+e5.email);
		System.out.println("Employee Mobile Number : "+e5.mobile);
		
				
	}
}
