package fundamentals;

import java.util.Scanner;


  

public class sumOfTwoNumbers {
	
	public static int sum(int i,int j) {
		return i + j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ajaryya please enter the first number :");
		int firstNumber = sc.nextInt();
		System.out.println("Enter the second number :");
		int secondNumber = sc.nextInt();
		
		System.out.println("Addition of Two Number is :" + sum(firstNumber,secondNumber));
		sc.close();

	}

}
