import java.util.Scanner;

class ManupulateApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Amount of apple:");
		int Apple = sc.nextInt();
		System.out.print("Enter the number of Guards:");
		int Guards = sc.nextInt();
		String Answer = (Apple<Guards)?"NO":(Apple>Guards)?"YES":"YES";
		System.out.println(Answer);
	}
}