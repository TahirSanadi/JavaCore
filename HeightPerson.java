import java.util.Scanner;

class HeightPerson{
	public static void main(String args[]){
		float height;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height in CentiMeter");
		height=sc.nextFloat();
		if(height<150.0){
			System.out.println("Dwarf..!");
		}else if(height>=150.0 && height<160.0){
			System.out.println("Avrage heighted..!");
		}else if(height>=160.0 && height<195.0){
			System.out.println("Tall peraosn...!");
		}else{
			System.out.println("Enter valid height");
		}
	}
}