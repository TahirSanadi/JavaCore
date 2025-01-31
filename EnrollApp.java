import java.util.Scanner;

class EnrollApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("The Student want to Enroll:");
		int StudToEnroll = sc.nextInt();
		System.out.print("The Maximum capacity:");
		int MaxCapacity = sc.nextInt();
		System.out.print("The Student already Enrolled:");
		int EnrolledStud= sc.nextInt();
		int remainingSeats = MaxCapacity - EnrolledStud;
		String result = StudToEnroll <= remainingSeats ? "YES" : "NO";
		System.out.println(result);
		
	}
}