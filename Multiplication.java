package basicProgramme;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the value of a:");
		int a =obj.nextInt();
		for(int i=1; i<=10; i++) {
			int result = a*i;
			System.out.println(a +"*"+ i +"=" +result);
			
		}

	}

}
