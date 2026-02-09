import java.util.Scanner;
class Temprature1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter amount of water in kilograms:");
	double mass = sc.nextDouble();
	System.out.println("Enter InitialTemp:");
	double initialTemp= sc.nextDouble();
	System.out.println("Enter finalTemp:");
	double finalTemp = sc.nextDouble();
	
	double energy = mass * (finalTemp - initialTemp)* 4184;
	System.out.println("Energy:" + energy);
	}
}
	
