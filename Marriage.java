import java.util.Scanner;
class Marriage{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter age:");
	int age=sc.nextInt();
	System.out.println("Enter your property:");
	double property = sc.nextDouble();
	System.out.println("Enter your sirname:");
	String sirname= sc.next();
	
	if(age>=21 && property && property>=10000000 && sirname.equals("AMBANI")){
		System.out.println("Congratulations you are eligible");
	}
	else{
		System.out.println("Sorry  you are not eligible");
	}
	}
}
		
