import java.util.Scanner;

class ElectricityBill{
	public static void main(String args[]){
		int unit;
		Scanner sc=new Scanner(System.in);
		unit=sc.nextInt();
		double bill;
		double bill50=0,bill100=0,billnxt100=0,bill250=0;
		double totalbill, charges, total;
		
		if(unit>50){
			unit=unit-50;
			bill50=50*0.50;
			//System.out.println("your bill:"+bill);
		}else{
			bill50=unit*0.50;
			//System.out.println("your bill:"+bill);
		}
		if(unit>100){
			unit=unit-100;
			billnxt100=100*0.75;
			//System.out.println("your bill:"+bill);
		}else{
			billnxt100=unit*0.75;
			//System.out.println("your bill:"+bill);
		}
		if(unit>100){
			unit=unit-100;
			bill100=100*1.20;
			//System.out.println("your bill:"+bill);
			
		}else{
			bill100=unit*1.20;
		}
		if(unit<=250 || unit>250){
			bill250=unit*1.50;
		}
		totalbill=bill50+bill100+billnxt100+bill250;
		charges=(totalbill*20)/100;
		total=totalbill+charges;
		System.out.println("Your Electricity Bill is:"+total);
	}
}
