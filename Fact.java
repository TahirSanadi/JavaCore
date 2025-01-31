//WAP to enter number and calculate its factorial using while loop
import java.util.Scanner;

class Fact{
	public static void main(String args[]){
		int a,fact=1;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		int i=1;
		while(i<=a){
			fact=fact*i;
			i++;
		}
		System.out.println("factorial of "+a+"is:"+fact);
	}

}