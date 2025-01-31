//wap to check number is divisible by 5 and 11;

public class Div{
	public static void main(String x[]){
		int a;
		a=Integer.parseInt(x[0]);
		int ans= a%5;
		int ans1= a%11;
		String result = (ans==0)&&(ans1==0) ? "The number is devisible by 5 and 11" : "The number is not devisible by 5 and 11";
		System.out.printf(result);
	}
}