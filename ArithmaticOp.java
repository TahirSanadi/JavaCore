import java.util.*;

class ArithmaticOp{
	public static void main(String x[]){
		int a,b;
		Scanner xyz = new Scanner(System.in);
		System.out.printf("Enter first numbers:");
		a=xyz.nextInt();
		System.out.printf("Enter Second numbers:");
		b=xyz.nextInt();
		int c=a+b;
		System.out.printf("The addition is %d\n",c);
		int d=a*b;
		System.out.printf("The Mutiplication is %d\n",d);
		int e=a-b;
		System.out.printf("The substrsction is %d\n",e);
		int f=a/b;
		System.out.printf("The divesion is %d\n",f);
	}
}