//WAP to enter length and breadth of reactangle and find its area

import java.util.*;

public class RectArea{
	public static void main(String x[]){
		int length, breadth, area;
		Scanner ref = new Scanner(System.in);
		System.out.printf("Enter length:");
		length = ref.nextInt();
		System.out.printf("Enter breadth:");	
		breadth =ref.nextInt();
		
		area =length*breadth;
		System.out.printf("The Area of reactangle is: %d ",area);
	}
}