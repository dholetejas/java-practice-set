class Runner{
	public static void main(String[] args){
	double miles = 24;
	double  kilometers = miles * 1.6;

	double hours = 1 + (40.0/60) + (35.0/3600);
	double average = kilometers/hours;
	System.out.println("Average:"+ average);
	}
}