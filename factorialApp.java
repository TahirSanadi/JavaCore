//finding factorial using recursive function

class factorial{
	int fact(int n){
		int result;
		if(n==1)
			return 1;
		result =fact(n-1)*n;
		System.out.println(result);
		return result;
	}
}

class factorialApp{
	public static void main(String args[]){
		factorial f=new factorial();
		System.out.println("Factorial of 3 is:"+f.fact(3));
		System.out.println("Factorial of 4 is:"+f.fact(4));
		System.out.println("Factorial of 6 is:"+f.fact(6));
	}
}