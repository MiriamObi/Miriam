package assignment5_forLoop;
import java.util.Scanner;
public class Question6 {
	
	public static void main(String[] args) {
		
	 /*Write a program to print Fibonacci series of 
		n terms where n is declared by user : 
		 0, 1, 1, 2, 3, 5, 8, 13, 21, 34....
		 
		 This is an Example of Fibonacci series of 9 terms
		 
		 term number  0  1  2  3  4  5  6  7   8   9 
		 Actual value 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the term number? ");
		int n = scan.nextInt();
		
		int num1 = 0;
		int num2 = 1;
		int sum;
		
		for(int i = 2; i <= n; i++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
		
		System.out.println("The final number in sequence is " + num2);
		
		
		
		
	}

}
