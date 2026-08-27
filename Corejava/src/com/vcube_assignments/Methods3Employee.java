package com.vcube_assignments;
/* 27-08-2026
   Create a Java class Employee for a company.
   Create separate methods(No Return_Type + No Parameters) to print each employee detail.
	Display the following details:
	-Employee name
	-Employee ID
	-Department
	-Salary
	-Experience
	-Company name
	Call all the methods from the main() method.
 */
public class Methods3Employee {
	/*
	static String company;
	String ename;
	int eid;
	String dept;
	float sal;
	float exp;
	*/
	public static void main(String[] args) {
		System.out.println("Employee Details--->");
		/*
		Methods3Employee m=new Methods3Employee();
		company="Delloite";
		m.ename="Jaya";
		m.eid=1034;
		m.dept="HR";
		m.sal=36000;
		m.exp=2.6f;
		m.getCompany();
		m.getname();
		m.getId();
		m.getDept();
		m.getSalary();
		m.getExperience();
				
		System.out.println("Employee 2 Details--->");
		Methods3Employee m2=new Methods3Employee();
		company="Accenture";
		m2.ename="Anusha";
		m2.eid=8945;
		m2.dept="Developer";
		m2.sal=31000;
		m2.exp=0.6f;
		m2.getCompany();
		m2.getname();
		m2.getId();
		m2.getDept();
		m2.getSalary();
		m2.getExperience();
		*/
		Methods3Employee m=new Methods3Employee();
		m.getCompany();
		m.getname();
		m.getId();
		m.getDept();
		m.getSalary();
		m.getExperience();
	}
	void getExperience() {
		float exp=0.6f;
		  System.out.println("Employee Experience : "+exp);
	}
	void getSalary() {
		float sal=36000;
		  System.out.println("Employee Salary : "+sal);
	}
	void getDept() {
		String dept="HR";
		  System.out.println("Employee Department : "+dept);
	}
	void getCompany() {
		String company="Suraj Laboratories";
		  System.out.println("Employee Company : "+company);
	}
	void getId() {
		int eid=109;
		  System.out.println("Employee Id : "+eid);
	}
	 void getname() {
		 String name="Jaya";
		System.out.println("Employee Name : "+name);
	}
}
