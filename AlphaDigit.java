//wap to find out input and check wheather it is aplphabet or digit;
import java.util.Scanner;
public class AlphaDigit{
	public static void main(String x[]){
		Scanner ref = new Scanner(System.in);
		System.out.printf("Enter the character");
		char i = ref.next().charAt(0);
		String result = i=='0' || i=='1' || i=='2' || i=='3' || i=='4' || i=='5' || i=='6' || i=='7' || i=='8' || i=='9' ? "This is digit" : "This is alphabet";
		System.out.printf(result);
	}
}