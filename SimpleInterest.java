//wap to calculate simple interest
/*
 si= (P*R*T)/100;
*/

public class SimpleInterest{
	public static void main(String x[]){
		float P, R, T;
		float SI;
		P=Float.parseFloat(x[0]);
		R=Float.parseFloat(x[1]);
		T=Float.parseFloat(x[2]);
		SI=(P*R*T)/100;
		System.out.printf("The simple interest is:%.4f", SI);
	}
}