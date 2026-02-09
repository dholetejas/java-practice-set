import java.util.Scanner;
class StaticFact{
	static Scanner sc = new Scanner(System.in);
	static int fact = factorial(sc.nextInt());
	
	public static void main(String[] args)
	{
		System.out.println("main");
		System.out.println("Factorial:"+fact);
	}	
	public static int factorial(int num)
	{
		System.out.println("factorial Method");
		int fact=1;
		for(int i=1;i<=num;i++)
		
			fact*=i;
			return fact;
		
	}
}
	