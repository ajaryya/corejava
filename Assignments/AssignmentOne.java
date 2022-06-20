package Assignments;

import java.util.Scanner;

/*
 * Define a static Method that computes the age in terms of years and months for a given birthMonth and birthYear of a person.

Calculate and return the age as a decimal number with precision upto a max of 2 decimal places by referring following example.

Example:

if the age is 15 years and 6 months, then the output should be 15.5
if the age is 20 years abd 3 months, then the output should be 20.25

Write the method with the following specifications

Name of method : calculateAge
Arguments : 2 integers (birthMonth, birthYear)
Return Type : double

Return -1.0 if any input is negative.
Return -2.0 if input is greater than current month and year.
Return age as per above the example, if input is correct.
 */

public class AssignmentOne {
     
	static double birthYear;
	static double birthMonth;
	static double currentYear;
	static double currentMonth;
	static double age;
	
	public static double calculateAge() {
		
		
		double result1;
		double months=12;
		double result2 ;
		if(birthYear < currentYear) {
			result1= currentYear - birthYear;
		}
		
		
		else
		{
			result1=birthYear-currentYear;
		}
		if(birthMonth < currentMonth)
		{
			result2= currentMonth - birthMonth;
		}
		else
		{
			result2= (birthMonth - currentMonth);
		}
		age= result1 + (result2/12);
		
		
		
		return age;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enther the birth year");
		birthYear=sc.nextInt();
		System.out.println("enter the current year");
		currentYear=sc.nextDouble();
		System.out.println("enter the birth month");
		birthMonth=sc.nextDouble();
		System.out.println("enther the current month");
		currentMonth=sc.nextDouble();
		
		System.out.println(calculateAge());
		
		
		

	}

}
