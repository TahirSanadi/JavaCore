/*Q2. Write a java program to find total number of notes in given amount.		
		Enter the amount: 2528

		Expected output:

		500=5
		100=0
		50=0
		20=1
		10=0
		5=1
		2=1
		1=1
*/

import java.util.Scanner;

class NumberOfNotes{
	public static void main(String args[]){
		int amount;
		Scanner sc=new Scanner(System.in);
		amount=sc.nextInt();
		if(amount>=500){
			int fivehundNote=amount/500;
			System.out.println("500="+fivehundNote);
			amount=amount%500;
		}else System.out.println("500=0");
		if(amount>=100){
			int hundredNote=amount/100;
			System.out.println("100="+hundredNote);
			amount=amount%100;
		}else System.out.println("100=0");
		if(amount>=50){
			int fiftyNote=amount/50;
			System.out.println("50="+fiftyNote);
			amount=amount%50;
		}else System.out.println("50=0");
		if(amount>=20){
			int TwintyNote=amount/20;
			System.out.println("20="+TwintyNote);
			amount=amount%20;
		}else System.out.println("20=0");
		if(amount>=10){
			int tenNote=amount/10;
			System.out.println("10="+tenNote);
			amount=amount-(tenNote*10);
		}else System.out.println("10=0");
		if(amount>=5){
			int fiveCoin=amount/5;
			System.out.println("5="+fiveCoin);
			amount=amount%5;
		}else System.out.println("5=0");
		if(amount>=2){
			int twoCoin=amount/2;
			System.out.println("2="+twoCoin);
			amount=amount%2;
		}else System.out.println("2=0");
		if(amount>=1 && amount!=0){
			int oneCoin=amount/1;
			System.out.println("1="+oneCoin);
			amount=amount%1;
		}else System.out.println("1=0");
	}
}