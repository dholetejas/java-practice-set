import java.util.Scanner;
class Temprature{
	public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a degree in celcius:");
	double degree = sc.nextDouble();

	double fahrenheit = (9.0/5)* degree + 32;
	
	System.out.println("Fahrenheit :" +fahrenheit);
	}

} 
