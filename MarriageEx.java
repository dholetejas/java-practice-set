import java.util.Scanner;
class MarriageEx{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in); 
	System.out.println("Enter your age:");
	int age = sc.nextInt();
	System.out.println("Enter your property:");
	double property = sc.nextDouble();
	if(age>=21 && property >=10000000){
		System.out.println("Congratulations you are eligible to marriage");
	}
	else{
		System.out.println("Enter your Surname:");
		String surname= sc.next();
		if(surname.equalsIgnoreCase("AMBANI")){
			System.out.println("You are eligible for marriage");
		}else{
			System.out.println("sorry you are not aligible for marriage");
		}
		}

	}
}
	