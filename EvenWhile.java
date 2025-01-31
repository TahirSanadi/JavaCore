//WAP find even number in it

import java.util.Scanner;

class EvenWhile{
	public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int i=1;
		while(i<=num){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
	}
}