//WAP to find max between two numbers

public class Max{
	public static void main(String x[]){
		int a, b;
		a=Integer.parseInt(x[0]);
		b=Integer.parseInt(x[1]);
		String result= a>b ? "a is greater" : "b is greater";
		System.out.println(result +" that is "+ b);
	}
}