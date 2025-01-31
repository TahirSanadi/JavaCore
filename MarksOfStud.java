/*
Write a java program to input marks of five subjects Physics, Chemistry, Biology, 
Mathematics and Computer, calculate percentage and grade according to given conditions:
	percentage >= 90% : First
	percentage >= 80% : Second
	percentage >= 70% : Third
*/
import java.util.Scanner;

class MarksOfStud{
	public static void main(String args[]){
		int sub1,sub2,sub3,sub4,sub5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of Physics:");
		sub1=sc.nextInt();
		System.out.println("Enter the marks of Chemistry:");
		sub2=sc.nextInt();
		System.out.println("Enter the marks of Biology:");
		sub3=sc.nextInt();
		System.out.println("Enter the marks of Mathematics:");
		sub4=sc.nextInt();
		System.out.println("Enter the marks of Computer:");
		sub5=sc.nextInt();
		
		int total=sub1+sub2+sub3+sub4+sub5;
		float percentage=total/5;
		if(percentage>=90){
			System.out.println("First");
		}else if(percentage>=80){
			System.out.println("Second");
		}else if(percentage>=70){
			System.out.println("Third");
		}else{
			System.out.println("Enter valid marks");
		}
	}
}