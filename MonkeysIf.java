import java.util.Scanner;

class MonkeysIf{
	public static void main(String args[]){
		int n,k,j,m,p;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		j=sc.nextInt();
		m=sc.nextInt();
		p=sc.nextInt();
		if((m>k && m%k==0)||(p>j && p%j==0)){
			int EatB=m/k;
			System.out.println(EatB+" Monkeys Eat bananas");
			int EatP=p/j;
			System.out.println(EatP+" Monkeys Eat Penuts");
			int totalEat = EatB+EatP;
			int remain=n-totalEat;
			System.out.println(remain+" remain on the tree");
		}else{
			System.out.println("Invalid inputs..!");
		}
	}
}