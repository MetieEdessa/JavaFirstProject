package com.homeworkday2;

public class LeapYearJava {

	public static void main(String[] args) {
		// check given year is leap year or not.
		
		int year = 1700;
		boolean leap=false;
		if ((year % 400 == 0)
	            || ((year % 4 == 0) && (year % 100 != 0))){
			 leap = true;
			 System.out.println("it is " + leap);
		 }
				 else {
					 System.out.println("it is "+leap);
			} 
		
		int age =20;
		boolean minor=false;
		if(age<20) {
		minor = true;
		}
		else {
			System.out.println(false);
		}
		
		
		
		}
}
