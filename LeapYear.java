//WAP to find year id leap or not

public class LeapYear{
	public static void main(String x[]){
		int year;
		year = Integer.parseInt(x[0]);
		String result = year%4==0 ? "The year is leap year" : "The year is not leap year";
		System.out.println(result);
	}
}