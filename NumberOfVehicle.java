/*
Example11
An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to
make the production of both types of vehicle according to the given data below:
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
• 2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :
Input :
• 200 -> Value of V
• 540 -> Value of W
Output :
• TW =130 FW=70
*/

import java.util.Scanner;

class NumberOfVehicle{
	public static void main(String args[]){
		int v,w;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter vehicle:");
		v=sc.nextInt();
		System.out.println("Enter number of Wheels:");
		w=sc.nextInt();
		if(w>v && w>=2 && w%2==0){
			//int mod=w%v;
			//int FW=mod/2;
			//int TW=v-FW;
			int TW=((v*4)-w)/2;
			int FW=v-TW;
			System.out.println("Two Wheelers:"+TW);
			System.out.println("Four Wheeler:"+FW);
		}else{
			System.out.println("Invalid number..!");
		}
	}
}