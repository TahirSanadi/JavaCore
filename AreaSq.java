//WAP to enter side of square and find its area
import java.util.*;

public class AreaSq{
	public static void main(String x[]){
		int sides;
		//using command line argument
		//sides = Integer.parseInt(x[0]);
		Scanner xyz=new Scanner(System.in);
		System.out.printf("Enter the sides of square:");
		sides =xyz.nextInt();
		//using Scanner class
		int Area = 2*sides;
		System.out.printf("Area of Square is %d\n ",Area);
	}
}