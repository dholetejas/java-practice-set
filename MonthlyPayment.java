import java.util.Scanner;
class MonthlyPayment{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the balance:");
	double balance = sc.nextDouble();
	System.out.println("Enter annualintersest rate:");
	double annualInterestRate = sc.nextDouble();
	
	double interest = balance * (annualInterestRate / 1200);
	System.out.println("Interest for the next Month :" + interest);
	}
}