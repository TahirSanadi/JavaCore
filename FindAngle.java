//wap to eanter tow angles and find third angel of tringle

public class FindAngle{
	public static void main(String x[]){
		int a, b, c;
		a=Integer.parseInt(x[0]);
		b=Integer.parseInt(x[1]);
		c=180-a-b;
		System.out.printf("The third angle is:%d",c);
	}
}