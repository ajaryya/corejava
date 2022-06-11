package basicProgramme;

import java.util.Scanner;

public class SwappingOfTwoNumber2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the value of a");
		a=s.nextInt();
		System.out.println("enter the value of b");
		b=s.nextInt();
		System.out.println("enter the value of c");
		c=s.nextInt();
		
		a= a+b;
		b= c+a;
		c= c+c;
		
		System.out.println("the value of a is :" + a );
		System.out.println("the value of b is :" + c );
		System.out.println("the value of c is :" +b);
		
		

	}

}
