//find third angle of triangle
import java.util.Scanner;

class FindThird{
	public static void main(String args[]){
		int angle1,angle2;
		Scanner sc = new Scanner(System.in);
		angle1=sc.nextInt();
		angle2=sc.nextInt();
		int angle3=180-angle1-angle2;
		System.out.println("The third angle will be "+ angle3);
	}
}