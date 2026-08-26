package com.vcube_assignments;
/* 26-08-2026 (2)--With primitive or with wrapper data results will be same
 * ----------
 	a) Take variables as studentId, studentName, gender, branchName,collegeName 
	   with corresponding data types.
	b) Take a Method To display the student Details. 
	c) Try to add atleast two student data.
	
	 Note :-  Take Primitive Data Types
 */
public class Methods2StuDetDisplay {
	static String collegename;
 	int stuid;
	String stuname;
	char gender;
	String branch;
	
	void display() {
		System.out.println("College Name : "+collegename);
		System.out.println("Student Id : "+stuid);
		System.out.println("Student Name : "+stuname);
		System.out.println("Gender : "+gender);
		System.out.println("Branch : "+branch);
	}
	public static void main(String[] args) {
		System.out.println("---Student 1 Details---");
		Methods2StuDetDisplay m1=new Methods2StuDetDisplay();
		collegename="SPMVV";
		m1.stuid=13;
		m1.stuname="Aswani";
		m1.gender='F';
		m1.branch="MCA";
		m1.display();
		System.out.println();
		System.out.println("---Student 2 Details---");
		Methods2StuDetDisplay m2=new Methods2StuDetDisplay();
		m2.stuid=26;
		m2.stuname="Manyutheswari";
		m2.gender='F';
		m2.branch="MCA";
		m2.display();
	}

}
