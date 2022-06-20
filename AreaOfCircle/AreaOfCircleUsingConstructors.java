package AreaOfCircle;

import java.util.Scanner;

public class AreaOfCircleUsingConstructors {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the radius:");
		double rad=sc.nextDouble();
		Area a=new Area(rad);
		System.out.println("Area of circle is "+ a.area);
		
		sc.close();

	}

}

class Area{
	double area;
	Area(double r){
		area= (22*r*r)/7;
		
		
	}
}
