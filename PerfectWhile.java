/*Output: Enter number:  6
Divisor of six except self: 1  2 and 3 so sum of 1+2+3=6
So we can say 6 is perfect number

Example: 
Output : Enter number :  8
Divisor of 8 is 1  2   4 so the sum of 1 2 4 is  7 so 7 is not equal with 8 so 8 is not a perfect number.
*/

import java.util.Scanner;

class PerfectWhile{
	public static void main(String args[]){
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int i=1;
		//int tmp=num;
		int numbers=0;
		//int total=0;
		while(i<num){
			if(num%i==0){
				numbers=numbers+i;
			}
			i++;
		}
		if(num==numbers){
			System.out.println(num+" is perfect number");
		}
		else{
			System.out.println(num+" is not a perfect number");
		}
	}
	
}