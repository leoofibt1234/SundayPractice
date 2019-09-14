package com.ali.sundaypractice;

public class SundayPractice {

	private String useInsideMe;  //only used inside same class file
	
	protected String willBeusedInsideChildClassOnly;  //same package , Child class]
	
	String name ; //same class and s
	
	
	
	 protected class InnerClassExample{
		
		
		String iAmPrivate;
		
		public InnerClassExample(String insideVal){
			
			useInsideMe = insideVal;
			
		}
		
		
	}
	
	
}
