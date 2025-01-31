//wap to input number and find its pelindrome
import java.util.Scanner;

public class Palin{
	public static void main(String x[]){
		Scanner ref = new Scanner(System.in);
	
		
		System.out.println("Enter Number");
		int num=ref.nextInt();
		int rev=0,rem,temp;
		
		temp=num;
		//____________________________
		
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
		//___________________________
		
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
		//___________________________
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
		//___________________________
		
		System.out.println(rev);
		
  		String s=(temp==rev)?"P":"NP";
        System.out.println(s);
		
	}
}



 