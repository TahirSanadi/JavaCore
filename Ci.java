//Formula to calculate compound interest annually is given by.

import java.util.Scanner;
import java.lang.*;

class Ci{
	public static void main(String args[]){
		double p,t,r;
		Scanner sc=new Scanner(System.in);
		p=sc.nextDouble();
		t=sc.nextDouble();
		r=sc.nextDouble();
		double x,rt;
		x=(r/100)+1;
		rt=Math.pow(x,t);
		double ci=p*rt;
		System.out.println("compound interest:"+ci);
	}
}