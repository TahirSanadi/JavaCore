/* WAP to input the two values consider first is base and second is index and calculate its power using while loop?
Output:
Input base : 5
Integer index:3
Power is : 125
*/
import java.util.Scanner;

class PowerWhile{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int index=sc.nextInt();
		int temp=1;
		int i=0;
		while(i<index){
			temp=temp*base;
			i++;
		}
		
		System.out.println(temp);
	}
}