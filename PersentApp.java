//wap to enter marks of 5 subjects and calculate its presentage

public class PersentApp{
	public static void main(String x[]){
		float s1,s2,s3,s4,s5,total;
		s1=Integer.parseInt(x[0]);
		s2=Integer.parseInt(x[1]);
		s3=Integer.parseInt(x[2]);
		s4=Integer.parseInt(x[3]);
		s5=Integer.parseInt(x[4]);
		
		total = s1+s2+s3+s4+s5;
		float persentage = total/6;
		System.out.printf("The persentage of student is:%.2f",persentage);
		
		
	}
}