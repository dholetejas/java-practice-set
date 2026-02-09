import java.util.Scanner;
class EmployeeEx{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Salary:");
	double salary=sc.nextDouble();
	double dupSal=salary;
	System.out.println("Enter your targetScore:");
	int score=sc.nextInt();
	
	if(score<0 || score>100){
		System.out.println("Invalid Score"+score+ "entered");
		return;
	}
	if(score>=90){
		System.out.println("Your salary revised by 3%");
		salary = salary*(salary*0.03);
	}
	else{
		System.out.println("your salary revised by 1%");
		salary = salary*(salary*0.01);
	}
	System.out.println("Initisl salary:" + dupSal);
	System.out.println("Revised salary :" + salary);
	}
}
