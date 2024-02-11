package com.homeworkday2;

public class Grade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Grade= (80);
		String gradeInput = "";
			
		if (Grade >= 90){
			gradeInput = "A"; 
		}
		if (Grade >=80 && Grade <=89){
			gradeInput = "B";
			}
		if (Grade >=70 && Grade <=79){
			gradeInput = "C";
		}
		if (Grade >=60 && Grade <=69){
			gradeInput ="D";
		}
		if (Grade <= 59){
			gradeInput = ("F");
		}
		System.out.println(gradeInput);
	}

}
