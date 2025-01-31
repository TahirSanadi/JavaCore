//WAP to check entered number is positive

import java.util.Scanner;

public class Positive{
	public static void main(String args[]){
		int Number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		Number=sc.nextInt();
		if(Number>0){
			System.out.println("Positive");
		}
		System.out.println("Thank you");
	}
}