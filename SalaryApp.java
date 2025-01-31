//WAP to take input from user a BaseSalary with 30% of da & hra adding output should be total salary

public class SalaryApp{
	public static void main(String x[]){
		int bs, da, hra, total;
		bs=Integer.parseInt(x[0]);
		da=(bs*30)/100;
		hra=(bs*30)/100;
		total= bs+da+hra;
		System.out.println("the total salary of employee having Base Salary "+bs+" including da "+da+" and "+"hra "+ hra +" is "+total);
	}
}