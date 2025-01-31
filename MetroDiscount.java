/* 
metro  train senioer 25 60>
women 50%
child 75% 4<
if child & senoier 

*/
import java.util.Scanner;

public class MetroDiscount{
	public static void main(String args[]){
		int UserInput;
		Scanner input = new Scanner(System.in);
		System.out.print("If you are Senioer men citizen press 1\n");
		System.out.print("If you are Women press 2\n");
		System.out.print("If you are Child press 3\n");

		UserInput=input.nextInt();
		if(UserInput==1){
			int age;
			System.out.print("Enter your age:");
			age = input.nextInt();
			if(age>59){
				System.out.println("congtrats you got 25% Discount");
			}
			else{
				System.out.println("You are not Senioer Citezen");
			}
		}
		else if(UserInput==2){
			System.out.println("Congrats you got 50% Discount");
		}
		else if(UserInput==3){
			int AgeOfChild;
			System.out.print("Enter the Age of Child:");
			AgeOfChild = input.nextInt();
			if(AgeOfChild<5){
				System.out.println("\nCongrats you got Discount of 75%");
			}
			else{
				System.out.print("You are not child anymore");
			}
		}
	}
}

