//wap to convert the following temp from celcius to ferhenite

public class FerToCel{
	public static void main(String x[]){
		float temp = Float.parseFloat(x[0]);
		float celcius=(temp-32)*5/9;
		System.out.printf("The temp in celcius is:%.2f",celcius);
	}
}