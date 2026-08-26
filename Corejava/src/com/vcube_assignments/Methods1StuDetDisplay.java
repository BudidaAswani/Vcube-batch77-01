package com.vcube_assignments;
/* 26-08-2026 (1)--With primitive or with wrapper data results will be same
 * ----------
 	a) Take variables as studentId, studentName, gender, branchName,collegeName 
	   with corresponding data types.
	b) Take a Method To display the student Details. 
	c) Try to add atleast two student data.
	
	 Note :-  Don't Take Primitive Data Types
 */
public class Methods1StuDetDisplay {
	/* Note : Do not use these primitive data types
	 	static String collegename;
	 	int stuid;
		String stuname;
		char gender;
		String branch;
	 */
	static String collegename;
	Integer sid;
	String sname;
	Character gender;
	String branch;
	
/*		static void display() {
		System.out.println("College Name : "+collegename);
		-- Using the non-static field's like sid, sname, gender, branch in the static methods or block like static reference cant use directly 
		System.out.println("Student Id : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Gender : "+gender);
		System.out.println("Branch : "+branch);
	}
*/
	void display() {
		System.out.println("College Name : "+collegename);
		System.out.println("Student Id : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Gender : "+gender);
		System.out.println("Branch : "+branch);
	}
	public static void main(String[] args) {
		System.out.println("---Student 1 Details---");
		Methods1StuDetDisplay m1=new Methods1StuDetDisplay();
		collegename="SPMVV";
		m1.sid=13;
		m1.sname="Aswani";
		m1.gender='F';
		m1.branch="MCA";
		m1.display();
		System.out.println();
		System.out.println("---Student 2 Details---");
		Methods1StuDetDisplay m2=new Methods1StuDetDisplay();
		m2.sid=26;
		m2.sname="Manyutheswari";
		m2.gender='F';
		m2.branch="MCA";
		m2.display();
	}

}
