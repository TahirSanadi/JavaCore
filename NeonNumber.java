import java.util.Scanner;

class NeonNumber{
	public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int square=num*num;
		int temp,dev,rem;
		rem=square%10;
		dev=square/10;
		int Neon=rem+dev;
		if(Neon==num){
			System.out.println(num+" is Neon number");
		}else if(Neon!=num){
			System.out.println(num+" is Neon not number");
		}
		else{
			System.out.println(num+" is not Neon number");
		}
	}
}