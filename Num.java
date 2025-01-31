//wap to find number is pos or neg

public class Num{
	public static void main(String x[]){
		int a;
		a=Integer.parseInt(x[0]);
		String result = (a < 0 ) ? "The number is negetive": "The number is positive";		
		System.out.printf(result);
	}
}