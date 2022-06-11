package basicProgramme;

import java.util.Scanner;

public class NumberOfPositive {

	public static void main(String[] args) {
          
		Scanner sc= new Scanner(System.in);
		int[] a = new int[20];

		for(int i = 0; i < a.length; i++) {
		  System.out.println("Enter next num: ");
		  a[i] = sc.nextInt();
		
		if(a[i] <0) {
			System.out.println(a[i]+ "  is negative");
			
		}
		else
		{
			System.out.println(a[i] + "   is positive");
			if(a[i] % 2 == 0)
			{
				System.out.println(a[i] + " is even");
			}
			else
			{
				System.out.println(a[i] + "is odd");
			}
				
		}
		}

	}

}
