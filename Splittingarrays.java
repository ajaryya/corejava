package basicProgramme;

import java.util.Scanner;

public class Splittingarrays {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("how many values you are going to give in array");
		int i= sc.nextInt();
		int[] b  =new int[i];
		for(i=0; i<b.length; i++)
		{
			System.out.println("enter " + i +" value :");
			b[i]=sc.nextInt();
		}
		int[] j= array_split(b[i]/2);
		System.out.println(j[i]);
		
		
		
		
		
		

	}

	private static int[] array_split(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
