package AreaOfCircle;

import java.util.Scanner;

public class AreaOfCircleWithStaticMethod {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the radius:");
		
		double r= sc.nextDouble();
		
		double area=(22*r*r)/7 ;
		System.out.println("Area of the circle:" + area);
		
      sc.close();
	}

}
