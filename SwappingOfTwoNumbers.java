package basicProgramme;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the value of a");
		a=s.nextInt();
		System.out.println("enter the value of b");
		b=s.nextInt();
		
		c=a;
		b=c;
		System.out.println("the value of c is :" +c);
		System.out.println("the value of b is :" +b);
		
		
	}

}
