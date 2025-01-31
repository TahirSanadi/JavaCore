/*Q4. WAP to input the number and count its digit?
Output:
Enter number: 12345
Number of digit is : 5 
*/
import java.util.Scanner;

class CountDigitWhile{
	public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int count=0;
		while(num>0){
			num=num/10;
			count++;
			
		}
		System.out.println(count);
	}
}