import java.util.Scanner;

class CabIf{
	public static void main(String args[]){
		int xx, yy;
		Scanner sc=new Scanner(System.in);
		xx=sc.nextInt();
		yy=sc.nextInt();
		if(xx<yy){
			System.out.println("first");
		}else if(yy<xx){
			System.out.println("second");
		}else if(xx==yy){
			System.out.println("any");
		}else{
			System.out.println("invalid..!");
		}
	}
}