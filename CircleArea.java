import java.util.*;

class CircleArea{
	public static void main(String x[]){
		int radius, diameter;
		double circumfarence;
		double area;
		
		System.out.println("Ennter Radius:");
		Scanner ref= new Scanner(System.in);
		radius =ref.nextInt();
		diameter = 2*radius;
		System.out.printf("The diameter of circle is: %d\n", diameter);
		circumfarence =(2*3.14*radius);
		System.out.printf("The circumfarence of circle is: %f\n", circumfarence);
		area=(3.14*(2*radius));
		System.out.printf("The Area of circle is: %f\n", area);
	}
}