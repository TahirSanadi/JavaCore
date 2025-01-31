//WAP to input extract the last digit from the number

public class Extract{
	public static void main(String x[]){
		int a,result;
		a=Integer.parseInt(x[0]);
		result =a%10;
		System.out.println("The last digit of given number is "+result);
	}
}