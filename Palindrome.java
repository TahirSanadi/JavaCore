import java.util.Scanner;

class Palindrome{
	public static void main(String args[]){
		int num;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		int rev=0,rem,temp=num;
		
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		
		System.out.println(rev);
		
		if(temp==rev){
			System.out.println(temp+" is palindrome");
		}else{
			System.out.println(temp+" is not palindrome number");
		}
	}	
}