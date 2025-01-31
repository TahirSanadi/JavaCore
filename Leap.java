//WAP to find leap year

import java.util.Scanner;

public class Leap{
	public static void main(String args[]){
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year:");
		year = sc.nextInt();
		if(year%4==0){
			System.out.println(year+" is leap year");
		}else{
			System.out.println(year+" is not leap year");
		}
		
	}
}