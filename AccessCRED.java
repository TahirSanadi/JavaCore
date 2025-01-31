import java.util.Scanner;

class AccessCRED{
	public static void main(String args[]){
		int CreditScore;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Credit Score:");
		CreditScore = sc.nextInt();
		String result = CreditScore >= 750 ? "YES" : "NO";
		System.out.println(result);
	}
}