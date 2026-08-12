package com.FirstPackage;

public class ObjCount {
	/* Q: Why do we use a static variable to count objects?
	 * 
	 * Answer: Because a static variable is shared by all objects of the class. 
	 * If count were not static, each object would have its own separate count variable,
	 * and you could not keep track of the total number of objects created.
	 */
	static int count = 0;
	{
		count++;
	}

	public static void main(String[] args) {
		ObjCount obj = new ObjCount();
		ObjCount obj1 = new ObjCount();
		new ObjCount();
//		new ObjCount();
		System.out.println("Welcome, Object count is " + ObjCount.count);
	}

}
