import java.util.Scanner;

public class BasicSal{
	public static void main(String args[]){
		int salary;
		Scanner sc=new Scanner(System.in);
		salary=sc.nextInt();
		if(salary<=10000){
			int HRA = salary*20/100;
			System.out.println("Your HRA is "+HRA);
			int DA = salary*80/100;
			System.out.println("Your DA is "+DA);
		}else if(salary<=20000){
			int HRA1=salary*25/100;
			System.out.println("Your HRA is "+HRA1);
			int DA1=salary*90/100;
			System.out.println("Your DA is "+DA1);
		}else if(salary>20000){
			int HRA2=salary*30/100;
			System.out.println("Your HRA is "+HRA2);
			int DA2=salary*95/100;
			System.out.println("Your DA is "+DA2);
		}else{
			System.out.println("Enter the correct Salary");
		}
	}
}