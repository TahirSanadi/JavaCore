//wap to input cost and seling price

import java.util.*;

public class pAndl{
	public static void main(String x[]){
		int sp,cp;
		Scanner ref = new Scanner(System.in);
		System.out.println("Enter the Cost price:");
		cp = ref.nextInt();
		System.out.println("Enter the selling price:");
		sp = ref.nextInt();
		String result = sp>cp ? "The seller has profit of"+ (sp-cp) : "The seller has loss of"+ (cp-sp);
		System.out.printf(result);
		
	}
}