package com.vcube_assignments;
/*
	Create 100 methods using " No return_Type + No Parameters "
 */
public class Methods100Create {

	public static void main(String[] args) {
		/*
		 -> Inside method another method can't be define or declare 
		 static void a() {
			
		}*/
		System.out.println("->Creating 100 Methods using 'No Retun_Type With No Parameters'");
		System.out.println();
		System.out.println("21 Methods about Course Details--->");
		System.out.println();
		Methods100Create m= new Methods100Create();
		welcome();
		m.course();
		institutes();
		m.javafee();
		m.pythonfee();
		m.devopsfee();
		m.join();
		System.out.println();
		System.out.println("5 Methods about Telugu Hero Details--->");
		System.out.println();
		telugumovie();
		m.heronames();
		blockbastermovie();
		m.upcomingmovie();
		System.out.println();
		System.out.println("6 Methods about Employee Details--->");
		System.out.println();
		company();
		m.ename();
		m.dept();
		m.salary();
		m.commission();
		System.out.println();
		System.out.println("34 Methods about Student Details--->");
		System.out.println();
		stuname();
		stucountry();
		stunationality();
		stugender();
		stumail();
		stuphone();
		stufamily();
		m.stuexp();
		m.ssc();
		m.inter();
		m.degree();
		m.pg();
		m.yeargaps();
		System.out.println();
		System.out.println("8 Methods about Food Details--->");
		System.out.println();
		food();
		System.out.println();
		System.out.println("7 Methods about Sweets Details--->");
		System.out.println();
		m.sweets();
		System.out.println();
		System.out.println("4 Methods about Snacks Details--->");
		System.out.println();
		m.snacks();
		System.out.println();
		System.out.println("5 Methods about Pickle Details--->");
		System.out.println();
		pickles();
		System.out.println();
		System.out.println("12 Methods about Cake Details--->");
		System.out.println();
		cakes();
		System.out.println("...Completed 102 methods...");
//		m.cooldrinks();
	}
	static void cakes() {
		System.out.println("Cakes---");
		cakeinclude();
	}
	static void cakeinclude() {
		System.out.println("Cakes items like");
		System.out.println(" -1. Veg cakes");
		System.out.println(" -2. Eggless cakes");
		System.out.println(" -3. Pan cakes");
		System.out.println(" -4. Pastry cake");
		System.out.println(" -5. Chocolate cakes");
		vegcakes();
		egglesscake();
		pancakes();
		pastry();
		chococakes();
	}
	static void chococakes() {
		System.out.println("Chocolate Cake's :");
		chococakeitems();
	}
	static void chococakeitems() {
		System.out.println("\tBlack Forest");
	}
	static void pastry() {
		System.out.println("Pastry's :");
		pastryitems();
	}
	static void pastryitems() {
		System.out.println("\tChocolate");
		System.out.println("\tStrawberry");
		System.out.println("\tVennilla");
		System.out.println("\tButterScarch");
		System.out.println("\tRed Velvet");
		System.out.println("\tBlack Forest");
	}
	static void pancakes() {
		System.out.println("Pan cake's :");
		pancakeitems();			
	}
	static void pancakeitems() {
		System.out.println("\tChocolate");
		System.out.println("\tStrawberry");
		System.out.println("\tVennilla");
		System.out.println("\tButterScarch");
	}
	static void egglesscake() {
		System.out.println("Eggless cake's :");
		egglesscakeitems();	
	}
	static void egglesscakeitems() {
		System.out.println("\tChocolate");
		System.out.println("\tStrawberry");
		System.out.println("\tVennilla");
		System.out.println("\tButterScarch");
	}
	static void vegcakes() {
		System.out.println("Veg cake's :");
		vegcakeitems();
	}
	private static void vegcakeitems() {
		System.out.println("\tChocolate");
		System.out.println("\tStrawberry");
		System.out.println("\tVennilla");
		System.out.println("\tButterScarch");
	
	}
	// 4 methods about Snacks Details
	void snacks() {
		System.out.println("Snacks---");
		snackinclude();
	}
	private void snackinclude() {
		System.out.println("Snacks include ");
		System.out.println("\tHomemade");
		System.out.println("\tOutSide");
		homemadesnacks();
		outsidesnacks();
	}
	void outsidesnacks() {
		System.out.println("Outside Snacks Means:");
		System.out.println(" -1. Manchuria");
		System.out.println(" -2. Kabab");
		System.out.println(" -3. Burger's");
	}
	void homemadesnacks() {
		System.out.println("Homemade Snacks Means:");
		System.out.println(" -1. Chekodi's");
		System.out.println(" -2. Cookie's");
	}
	// 5 methods about Pickle Details
	static void pickles() {
		System.out.println("Pickles--");
		System.out.println("Pickles include Veg and Non-veg");
		vegpickles();
		nonvegpickles();
	}
	static void nonvegpickles() {
		System.out.println("Non-Veg Pickles :");
		nonvegpickleitems();
	}
	static void nonvegpickleitems() {
		System.out.println(" -1. Chicken");
		System.out.println(" -2. Mutton");
		System.out.println(" -3. Prans");
	}
	static void vegpickles() {
		System.out.println("Veg Pickles :");
		vegpickleitems();
	}
	static void vegpickleitems() {
		System.out.println(" -1. Avakaya");
		System.out.println(" -2. Usiri");
		System.out.println(" -3. Tamoto");
		System.out.println(" -4. Lemon");
	}
	// 7 methods about Sweet Details
	void sweets() {
		System.out.println("Sweets---");
		sweetincludes();
		laddu();
		sweetitems();
	}
	void sweetitems() {
		System.out.println("Sweet Items :");
		list();
	}
	void list() {
		System.out.println(" -1. Laddu's");
		System.out.println(" -2. Gulab Jamun's");
		System.out.println(" -3. Kaju's");
		System.out.println(" -4. Rasmalai's");
		System.out.println(" -5. Putharekulu");
		System.out.println(" -6. Athrasalu");
		System.out.println(" -7. Rasagulla");
		System.out.println(" -8. Oliga");
		System.out.println(" -9. Payasam");
		System.out.println(" -10. Jilebi");
	}
	void laddu() {
		System.out.println("One of the most loved sweet is Laddu");
		laddus();
	}
	void laddus() {
		System.out.println("Differrent laddu's like");
		ladduitem();
	}
	void ladduitem() {
		System.out.println(" 1. Mothichoor");
		System.out.println(" 2. Tirupati Laddu");
		System.out.println(" 3. Boondhi Laddu");	
		System.out.println(" 4. Orange Laddu");
		System.out.println(" 5. Yellow Laddu");
	}
	void sweetincludes() {
		System.out.println("Sweets include like");
		System.out.println(" 1. Ghee");
		System.out.println(" 2. Sugar");
		System.out.println(" 3. Honey and so on");
	}
	// 8 methods about Food Details
	static void food() {
		System.out.println("Food include Veg, Non-veg");
		meals();
	}
	static void vegmeal() {
		System.out.println("\tVeg Meal");
	}
	static void nonvegmeal() {
		System.out.println("\tNon-Veg Meal");
	}
	static void meals() {
		System.out.println("Meal include :");
		vegmeal();
		nonvegmeal();
		veg();
		nonveg();
	}
	static void nonveg() {
		System.out.println("Non-Veg Meal includes :");
		nonvegitems();
	}
	static void nonvegitems() {
		System.out.println(" -1. Chicken Biryani");
		System.out.println(" -2. Mutton Biryani");
		System.out.println(" -3. Fish Biryani");
		System.out.println(" -4. Chicken Fry Piece Biryani");
		System.out.println(" -5. Chicken Dum Biryani");
		System.out.println(" -6. Mutton Keema Biryani");
		System.out.println(" -7. Prans Biryani");
		System.out.println(" -8. Chicken + Baghara Rice");
		System.out.println(" -9. Mutton + Baghara Rice");
		System.out.println(" -10. Appolo Fish Fry + Rice");
	}
	static void veg() {
		System.out.println("Veg Meal includes :");
		vegitems();	
	}
	static void vegitems() {
		System.out.println(" -1. Pappu Charu Annam");
		System.out.println(" -2. MuddaPappu Avakaya");
		System.out.println(" -3. Gutthi Vankaya Biryani");
		System.out.println(" -4. Capsicum Rice");
		System.out.println(" -5. Veg Biryani");
		System.out.println(" -6. Mushroom Biryani");
		System.out.println(" -7. Panner Biryani");
		System.out.println(" -8. Annam + Pappu + Vada");
		System.out.println(" -9. Annam + Pappu + Vadiyalu");
		System.out.println(" -10. Paramannam");	
	}
	// 34 methods about Student Details
	void stuexp() {
		System.out.println("Student Experience : Fresher");
	}
	void yeargaps() {
		System.out.println("There is no year gaps in Aswini's life");
	}
	static void stufamily() {
		System.out.println("Family--");
		totalmem();
	}
	static void totalmem() {
		System.out.println("Total 4 Member's Aswini's family");
		stufather();
		stumother();
		stubrother();
	}
	static void stubrother() {
		System.out.println("Brother name : Bala Krishna");
		brotherjob();
	}
	static void brotherjob() {
		System.out.println("Job : Finance Work");
	}
	static void stumother() {
		System.out.println("Mother name : Annapurna");
		motherjob();
	}
	static void motherjob() {
		System.out.println("Working Independent Women");
	}
	private static void stufather() {
		System.out.println("Father name : Raju");
		fatherjob();
	}
	static void fatherjob() {
		System.out.println("Job : Driver");
	}
	static void stucountry() {
		System.out.println("Country : Indian");
	}
	static void stuphone() {
		System.out.println("Phone : 1234567890");
	}
	static void stumail() {
		System.out.println("Mail : budiidhaaswini9867@gmail.com");
	}
	static void stugender() {
		System.out.println("Gender : Female");
	}
	static void stunationality() {
		System.out.println("Nationality : Indian");
	}
	void pg() {
		System.out.println("PG---");
		pgcourse();
		pgcity();
	}
	void pgcourse() {
		System.out.println("Joined : MCA Department");
	}
	void pgcity() {
		System.out.println("Place : Tirupati");
		pgyop();
	}
	void pgyop() {
		System.out.println("Year Of PassedOut : 2026");
		pgper();
	}
	void pgper() {
		System.out.println("MCA Percentage : 80%");
	}
	void degree() {
		System.out.println("Degree---");
		degreegroup();
	}
	void degreegroup() {
		System.out.println("Degree Group : BSC (Computer Science)");
		degreecity();
	}
	void degreecity() {
		System.out.println("Place : Dharmavaram");
		degreeyop();
	}
	void degreeyop() {
		System.out.println("Year Of PassedOut : 2024");
		degreeper();
	}
	void degreeper() {
		System.out.println("Degree Percentage : 83%");
	}
	void ssc() {
		System.out.println("SSC---");
		ssccity();
	}
	void inter() {
		System.out.println("Intermediate---");
		intercity();
	}
	void intercity() {
		System.out.println("Intermediate completed in Dharmavaram Girls College");
		interyop();
	}
	void interyop() {
		System.out.println("Inter Completed in 2021");
		interper();
	}
	void interper() {
		System.out.println("Intermediate Percentage : 88%");
	}
	void ssccity() {
		System.out.println("SSC completed in Dharmavaram");
		sscyop();
	}
	void sscyop() {
		System.out.println("SSC Year Of PassedOut : 2019");
		sscper();
	}
	void sscper() {
		System.out.println("SSC Percentage : 92%");
	}
	static void stuname() {
		System.out.println("Student name : Aswani");
	}
	// 6 methods about Employee Details
	void commission() {
		System.out.println("Commission : 8000");
	}
	void salary() {
		System.out.println("Salary : 35000");
	}
	void dept() {
		System.out.println("Department : Development");
	}
	void ename() {
		System.out.println("Employee name : Anusha");
		eid();
	}
	void eid() {
		System.out.println("Id : 1245898");
	}
	static void company() {
		System.out.println("Company name : TCS");
	}
	
	// 5 methods about Hero Movies
	static void telugumovie() {
		System.out.println("Welcome to the Telugu hero's world");
	}
	void heronames() {
		System.out.println("The hero name is Super Star Mahesh Babu");
		father();
	}
	static void father() {
		System.out.println("Father name is Super Star Krishna");
	}
	static void blockbastermovie() {
		System.out.println("Blockbuster movie's are more than 10");		
	}
	void upcomingmovie() {
		System.out.println("Upcoming movie is VARANASI..");
	}
	
	// 10 methods about Course
	public static void welcome() {
		System.out.println("Welcome to Course");
	}
	public void course() {
		System.out.println("Courses are available");
		courseDetails();
	}
	static void courseDetails() {
		System.out.println("\tJava Full Stack");
		System.out.println("\tPython Full Stack");
		System.out.println("\tDevOps Full Stack");
	}
	void javafee() {
		System.out.println("Java Full Stack : 26,000");
		javatiming();
	}
	void pythonfee() {
		System.out.println("Python Full Stack : 28,000");
		pythontiming();
	}
	void devopsfee() {
		System.out.println("DevOps Full Stack : 18,000");
		devopstiming();
	}
	static void javatiming() {
		System.out.println("Java Full Stack Timing : 10:00 AM - 12:00 PM");
	}
	static void pythontiming() {
		System.out.println("Python Full Stack Timing : 12:00 PM - 2:00 PM");
	}
	static void devopstiming() {
		System.out.println("DevOps Full Stack Timing : 2:00 PM - 4:00 PM");
	}
	void join() {
		System.out.println("Join us Learn more");
	}
	static void institutes() {
		System.out.println("Hyderabad Institutes---");
		place1();
		place2();
		place3();
		place4();
		place5();
		place6();
		place7();
		place8();
		place9();
		place10();
	}
	static void place10() {
		System.out.println("Place10 : Lakdikapool");
	}

	static void place9() {
		System.out.println("Place9 : Nijampet");
	}

	static void place8() {
		System.out.println("Place8 : LB Nagar");
	}

	static void place7() {
		System.out.println("Place7 : JNTU");
	}

	static void place6() {
		System.out.println("Place6 : SR Nagar");		
	}

	static void place5() {
		System.out.println("Place5 : Gachibowli");
	}
	static void place4() {
		System.out.println("Place4 : KPHB");
	}
	static void place3() {
		System.out.println("Place3 : Madhapur");
	}
	static void place2() {
		System.out.println("Place2 : Kukatpally");
	}
	private static void place1() {
		System.out.println("Place1 : Ameerpet");
	}
	
	
}
