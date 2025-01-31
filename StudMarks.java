import java.util.Scanner;

class StudMarks{
	public static void main(String args[]){
		int Phy,Math,Chem,Bio,Comp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of Physics:");
		Phy=sc.nextInt();
		System.out.println("Enter Marks of Mathamatics:");
		Math=sc.nextInt();
		System.out.println("Enter Marks of Chemistry:");
		Chem=sc.nextInt();
		System.out.println("Enter Marks of Biology:");
		Bio=sc.nextInt();
		System.out.println("Enter Marks of Computer");
		Comp=sc.nextInt();
		float percentage=(Phy+Math+Chem+Bio+Comp)/6;
		System.out.println(percentage+"%");
		if(percentage>=90){
			System.out.println("Grade A");
		}else if(percentage>=75){
			System.out.println("Grade B");
		}else if(percentage>=60){
			System.out.println("Grade c");
		}else if(percentage>=50){
			System.out.println("Grade D");
		}else if(percentage>=35){
			System.out.println("Grade E");
		}else if(percentage<35){
			System.out.println("Grade F");
		}else{
			System.out.println("Enter correct marks..!");
		}
	}
}