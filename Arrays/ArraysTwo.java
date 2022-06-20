package Arrays;

import java.util.Scanner;

public class ArraysTwo {

	public static void main(String[] args) {
		
        int i = 5;
        int j=2;
		
		int[][] arrayOne= new int[j][i];
		
		Scanner sc = new Scanner(System.in);
			if(j==1) {
				for(int n=0; n<i ;n++) {
				System.out.println("ENTER THE arrayOne[0][i] values");
				arrayOne[j][n]=sc.nextInt();
			
				}
			}
			if(j==2) {
				
			
			for(int m=0; m<i; m++) {
				System.out.println("ENTER THE arrayOne[1][i] values");
				arrayOne[j][m]=sc.nextInt();
			}
			}
			System.out.println(arrayOne[0][3]);
			System.out.println(arrayOne[1][3]);
			
			sc.close();
		}
	
		
		

	}


