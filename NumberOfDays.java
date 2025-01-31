import java.util.Scanner;

class NumberOfDays{
	public static void main(String args[]){
		int userInput;
		Scanner sc=new Scanner(System.in);
		userInput=sc.nextInt();
		switch(userInput){
			case 1:
				System.out.println("31");
				break;
			case 2:
				System.out.println("Enter year find its leap year or not");
				int year=sc.nextInt();
				String result = year%4==0 ? "29":"28";
				System.out.println(result);
				break;
			case 3:
				System.out.println("31");
				break;
			case 4:
				System.out.println("30");
				break;
			case 5: 
				System.out.println("31");
				break;
			case 6:
				System.out.println("30");
				break;
			case 7:
				System.out.println("31");
				break;
			case 8:
				System.out.println("31");
				break;
			case 9:
				System.out.println("30");
				break;
			case 10:
				System.out.println("31");
				break;
			case 11:
				System.out.println("30");
				break;
			case 12:
				System.out.println("31");
				break;
			default:
				System.out.println("invalid month");
		}
	}		
	
}