package com.FirstPackage;

public class PredictOutputOfBlocks {
	
	    static {
	        System.out.println("Static Block");
	    }

	  

	    public PredictOutputOfBlocks() {
	        System.out.println("Constructor");
	    }
	    {
	        System.out.println("Instance Block");
	    }
	    public static void main(String[] args) {

	        System.out.println("Main Method");

	        PredictOutputOfBlocks d1 = new PredictOutputOfBlocks();
	        PredictOutputOfBlocks d2 = new PredictOutputOfBlocks();
	    }
	
}
