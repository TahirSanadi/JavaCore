//wap to convert the temp

//take th temp
//foemulae to convert 
//display

public class Temp{
	public static void main(String x[]){
		float temp;
		temp=Float.parseFloat(x[0]);  
		float ferhenite= (temp*9/5)+32;
		System.out.printf("The temprature in ferhenite is:%.1f",ferhenite);
	}
}