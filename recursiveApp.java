//Recursive Function

class recursiveApp{
	static int fact(int n){
		if(n<=1){
			System.out.println("I am in if................");
			return 1;
		}
		else{
			System.out.println("I am in else");
			return n*fact(n-1);
		}
	}
	public static void main(String args[]){
		int a=fact(10);
		System.out.println(a);
	}
}