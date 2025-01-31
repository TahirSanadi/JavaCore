//find Enterd char is alphbet or digit

import java.util.Scanner;

class AlphaOrDigit{
	public static void main(String args[]){
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter character:");
		ch=sc.next().charAt(0);
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
			System.out.println(ch+" is Alphabet");
		}else if(ch>='0'&&ch<='9'){
			System.out.println(ch+" is digit");
		}
	}
}