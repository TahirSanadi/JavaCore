import java.util.Scanner;

class BeatIq{
	public static void main(String args[]){
		
		int CurrIqChef;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Current IQ of Chef:");
		CurrIqChef = sc.nextInt();
		System.out.print("Then chef learned to play musical instrument then IQ increased by +7\n");
		CurrIqChef+=7;
		String result = CurrIqChef >= 170 ? "YES" : "NO";
		System.out.println(result);
	}
		
}