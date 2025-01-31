//Write menu-driven programe to find area of 1)circle 2)rectangle 3)triangle 4)Square

import java.util.Scanner;

class AreaOpperations{
	public static void main(String args[]){
		int userInput;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice which area you want to calculate\n1.Area of circle\n2.Area of reactangel\n3.Area of Triangle\n4.Area of Square\n5.Area of circumfarence");
		float area;
		userInput=sc.nextInt();
		switch(userInput){
			case 1:
				int r;
				System.out.println("Enter the redius:");
				r=sc.nextInt();
				area = (float)3.14*r*r;
				System.out.printf("Area of circle:"+area);
				break;
			case 2:
				int l,b;
				System.out.print("Enter the length:");
				l=sc.nextInt();
				System.out.printf("\nEnter the breadth:");
				b=sc.nextInt();
				area = l*b;
				System.out.printf("Area of Reactangle:"+area);
				break;
			case 3:
				int h,b1;
				System.out.print("Enter the height of triangle:");
				h=sc.nextInt();
				System.out.printf("\nEnter the breadth of tragnle:");
				b=sc.nextInt();
				area=(float)((h*b)*0.5);
				System.out.printf("Area of Triangle:"+area);
				break;
			case 4:
				int a;
				System.out.println("Enter the side of Square:");
				a=sc.nextInt();
				area=a*a;
				System.out.println("Area of Square:"+area);
				break;
			case 5:
				int r1;
				System.out.println("Enter the radius of:");
				r1=sc.nextInt();
				area=(float)(6.28*r1);
				System.out.println("Area of circumfarence:"+area);
				break;
			default:
				System.out.println("Invalid input");
			}
			
	}
}