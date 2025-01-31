class Que7{
	public static void main(String args[]){
		int dailywages = 4;
		int number_of_days=5;
		int salary;
		salary = number_of_days++*--dailywages*dailywages++*number_of_days--;
		System.out.println(salary);
		salary = -dailywages;
		System.out.println(dailywages+" "+number_of_days+" "+salary);
	}
}