import java.util.Scanner;

class DiffeOperation{
	public static void main(String args[]){
		int userInput;
		System.out.println("Enter 1 if want check to number is positive,negeative or nutral \nEnter 2 to check number is even or odd \nEnter 3 to check max between 2 numbers \n");
		Scanner sc = new Scanner(System.in);
		userInput=sc.nextInt();
		switch(userInput){
			case 1:
				int num;
				num=sc.nextInt();
				System.out.println("Enter numbers to find its positive, negetive or nutral");
				String result1 = num<0 ? "The number is negeative" : num>0 ? "The number is positive" : "Number is Zero/nutral";
				System.out.println(result1);
				break;
			case 2:
				int num1;
				System.out.println("Enter number to identify its even or odd");
				num1=sc.nextInt();
				String result2 = num1%2==0 ?"The number is even": "The number is odd";
				System.out.println(result2);
				break;
			case 3:
				int num2, num3;
				System.out.println("Enter two numbers to find max between them");
				num2=sc.nextInt();
				num3=sc.nextInt();
				String result3 =num2>num3 ?"The first number is greater" : "The second number is greater";
				System.out.println(result3);
				break;
				
		}
	}
}