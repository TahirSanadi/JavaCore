//WAP enter base and heigth of triangle and find area

import java.util.Scanner;

public class AreaTri{
	public static void main(String x[]){
		int h,b,area;
		System.out.printf("Enter the heigth:");
		Scanner ref = new Scanner(System.in);
		h=ref.nextInt();
		System.out.printf("Enter the base:");
		b=ref.nextInt();
		area=(h*b)/2;
		System.out.printf("The area of Triangle is:%d",area);
	}
}