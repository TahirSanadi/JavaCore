import java.util.Scanner;

class ProfitOrLoss{
	public static void main(String args[]){
		int selling , purchasing;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the selling price & purhcasing price:");
		selling=sc.nextInt();
		purchasing=sc.nextInt();
		if(selling>purchasing){
			System.out.println("The seller has profit of "+(selling-purchasing));
		}else{
			System.out.println("The Seller has loss of "+(purchasing-selling));
		}
	}
}