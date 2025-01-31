//Wap to convert cm to meter

/*
first take length in cm
formulae to convert cm to meter
dsiplay
*/
import java.util.*;

public class CmToMeter{
	public static void main(String x[]){
		float length;
		System.out.printf("Enter length in centimeter:");
		Scanner ref=new Scanner(System.in);
		length=ref.nextInt();
		float meter=length/100;
		System.out.printf("The length in meter is:%f", meter);
	}
}