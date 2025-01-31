import java.util.Scanner;

class CabBookApp{
	public static void main(String args[]){
		int XX, YY;
		Scanner ref = new Scanner(System.in);
		System.out.print("Enter the FirstCab price:");
		XX = ref.nextInt();
		System.out.print("Enter the SecondCab price:");
		YY = ref.nextInt();
		String result = (XX<YY)?"Take FirstCab":(XX>YY)?"Take SecondCab":"Take Any";
		System.out.println(result);
		
		//String FIRST = XX<YY ? "Take the FirstCab": "";
		//System.out.println(FIRST);
		//String SECOND = XX>YY ? "Take the SecondCab": "";
		//System.out.println(SECOND);
		//String ANY = XX==YY ? "Take any Cab":"";
		//System.out.println(ANY);
		
	}
}