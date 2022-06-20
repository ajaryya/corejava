package Arrays;

import java.util.Scanner;

public class ArraysOne {

	public static void main(String[] args) {
		
		
		int i = 5;
		
		int[] arrayOne= new int[i];
		System.out.println("enter the array values");
		Scanner sc= new Scanner(System.in);
		for(int n=0; n<i ;n++) {
			arrayOne[n]=sc.nextInt();
		}
		System.out.println(arrayOne[3]);
		sc.close();
		
		 
		
		

	}

}
