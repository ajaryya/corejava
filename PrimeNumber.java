package basicProgramme;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n, i=2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter any number : ");
		n=sc.nextInt();
		
		while(true)
		{
			if(n==1)
			{
				System.out.println("Smallest Prime number is 2");
				break;
				
			}
			if(n%i ==0)
			{
				break;
			}
			else
			{
				i++;
				break;
			}
		}
		if(n==i)
		{
			System.out.println("Prime no");
			
		}
		else 
		{
			System.out.println("not prime no");
		}
		

	}

}
