//wap to find number odd & even
import java.util.Scanner;

public class OddEven{
	public static void main(String x[]){
		int a;
		System.out.printf("Enter the number:");
		Scanner ref = new Scanner(System.in);
		a=ref.nextInt();
		int b = a%2;
		String result= (b==0) ? "The number is even "+a  : "The number is odd "+a;
		System.out.printf(result);
	}
}	