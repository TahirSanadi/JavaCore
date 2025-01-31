//Wap to check whether the triangle is equlatral, scalane or isosceles;
//scalane-if length of sides is different, isoscales-if length of two side is same, equlatral-if all sides length is same 

import java.util.Scanner;

class IdentifyTriangle{
	public static void main(String args[]){
		int len1,len2,len3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lengths of triangle");
		len1=sc.nextInt();
		len2=sc.nextInt();
		len3=sc.nextInt();
		if(len1!=len2 && len2!=len3 && len1!=len3){
			System.out.println("Triangle is scalane");
		}else if((len1==len2 && len2!=len3)||(len2==len3 && len2!=len1) || (len3==len1 && len3!=len2)){
			System.out.println("The triangle is isoscales");
		}else if(len1==len2 && len1==len3){
			System.out.println("The triangle is equlatral");
		}else{
			System.out.println("Enter the correct lengths");
		}
	}
}