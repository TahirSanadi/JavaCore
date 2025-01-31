import java.util.Scanner;

class CandyJar{
	public static void main(String args[]){
		int candyInJar=10,k=5;
		int order;
		System.out.println("Number of candies available:"+candyInJar);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your order:");
		order=sc.nextInt();
		int remainCandy=candyInJar-order;
		if(order<candyInJar && remainCandy>k){
			System.out.println("Number of candies sold:"+(order));
			System.out.println("Number of candies sold:"+(candyInJar-order));
		}
		else{
			System.out.println("Invalid input please");
		}
		if(remainCandy>=k){
			candyInJar=10;
		}
	}
}