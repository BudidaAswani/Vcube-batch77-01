package com.vcube_assignments;

public class Cricket {
	static int countryId;
	static String countryName;
	int jerseyNo;
	String PlayerName;
	String gender;
	
	public static void main(String[] args) {
		countryId=91;
		countryName="India";
		Cricket c1=new Cricket();
		c1.jerseyNo=7;
		c1.PlayerName="Dhoni";
		c1.gender="M";
//		c1.PlayerName="Virat Kohli";
		System.out.println(countryName+"(+"+countryId+")"+" Cricket Team Details-->>>");
		System.out.println("\t"+c1.PlayerName+"("+c1.gender+") Jersey Number "+c1.jerseyNo);
		Cricket c2=new Cricket();
		c2.jerseyNo=18;
		c2.PlayerName="Virat Kohli";
		c2.gender="M";
		System.out.println("\t"+c2.PlayerName+"("+c2.gender+") Jersey Number "+c2.jerseyNo);
		Cricket c3=new Cricket();
		c3.jerseyNo=18;
		c3.PlayerName="Smithi Mandhanna";
		c3.gender="F";
		System.out.println("\t"+c3.PlayerName+"("+c3.gender+") Jersey Number "+c3.jerseyNo);
		Cricket c4=new Cricket();
		countryId=61;
		countryName="Australia";
		c4.jerseyNo=77;
		c4.PlayerName="Ellyse Perry";
		c4.gender="F";
		System.out.println(countryName+"(+"+countryId+")"+" Cricket Team Details-->>>");
		System.out.println("\t"+c4.PlayerName+"("+c4.gender+") Jersey Number "+c4.jerseyNo);

	}

}
