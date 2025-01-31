import java.util.Scanner;
import java.lang.*;


class QuadraticEquation{
	public static void main(String args[]){
		double b,a,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		double p,q,s,t;
		p=(b*b);
		q=(4*a*c);
		s=p-q;
		//System.out.println(s);
		double sq=Math.sqrt(s);
		//System.out.println(sq);
		t=2*a;
		double root1=((-b+sq)/(t));
		System.out.println(root1);
		double root2=((-b-sq)/(t));
		System.out.println(root2);
		
	}
}