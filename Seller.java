//WAP input selling price and cost price and find profit and loss of seller

public class Seller{
	public static void main(String x[]){
		int sp,cp;
		String result;
		sp=Integer.parseInt(x[0]);
		cp=Integer.parseInt(x[1]);
		result = sp>cp ?"The seller has profit of "+(sp-cp):" The seller has Loss of "+(cp-sp);
		System.out.println(result);
	}
}