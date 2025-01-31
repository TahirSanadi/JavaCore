//wap to to swap two numbers using third variable
import java.util.Scanner;

public class Swap{
	public static void main(String x[]){
		int a,b,c;
		System.out.printf("Enter number:");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		System.out.printf("Enter number:");
		b=ref.nextInt();
		System.out.println("Before Swaping a="+a+" and b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swaping a="+a+" and b="+b);
	}
}