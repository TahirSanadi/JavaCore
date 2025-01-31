//wap to find its neon or not
import java.util.*;
public class Neon{
	public static void main(String x[]){
		//int num = Integer.parseInt(x[0]);
		Scanner sc =new Scanner(System.in);
		System.out.printf("Enter the num:");
		int num =sc.nextInt();
		int sq = num*num;//81
		int rem = sq%10;//1
		int div= sq/10;//8
		int neon = rem+div;
		String result = (num==neon) ? "The number is noen" : "The number is not neon";
		System.out.printf(result);
	}
}