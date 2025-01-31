import java.util.Scanner;

class Arithmatic{
	public static void main(String args[]){
		
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:"+"\n");
		a=sc.nextInt();
		System.out.print("Enter the second number:"+"\n");
		b=sc.nextInt();
		System.out.print("Enter 1 for Addition"+"\n"+"Enter 2 for substraction"+"\n"+"Enter 3 for multiplication"+"\n"+"Enter 4 for devision \n");
		int userInput=sc.nextInt();
		
		switch(userInput){
			case 1:
				System.out.println("Addition="+ (a+b));
				break;
			case 2:
				System.out.println("Subsstraction="+ (a-b));
				break;
			case 3:
				System.out.println("Multiplication="+ (a*b));
				break;
			case 4:
				System.out.println("Division="+ (a/b));
				break;
			default:
				System.out.println("Enter the number from 1 to 4");
				break;
		}
	}
}