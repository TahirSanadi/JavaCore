//WAP to calculate compound interest
/*
amt= p*math.pow(1+(r/n),n*t)

ci = amt-p;
*/

import java.lang.Math.*;

public class CompInt{
	public static void main(String x[]){
		int p,r,n,t;
		p=Integer.parseInt(x[0]);
		r=Integer.parseInt(x[1]);
		n=Integer.parseInt(x[2]);
		t=Integer.parseInt(x[3]);
		int amt = p*Math.pow(1+(r/n),n*t);
		int CI =amt-p;
		System.out.printf("The compound Interest is:%d",CI);
		
	}
}


