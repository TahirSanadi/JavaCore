import java.util.*;

public class MarkApp{
	public static void main(String x[]){
		int s1,s2,s3,s4,s5,s6,agg;
		long persentage;
		Scanner xyz= new Scanner(System.in);
		System.out.println("Enter The subject marks");
		s1=xyz.nextInt();
		s2=xyz.nextInt();
		s3=xyz.nextInt();
		s4=xyz.nextInt();
		s5=xyz.nextInt();
		s6=xyz.nextInt();
		
		agg=s1+s2+s3+s4+s5+s6;
		persentage =agg/6;
		System.out.printf("The persentage of student is: %d", persentage);
	}
}