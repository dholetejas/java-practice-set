import java.util.Scanner;
class Helth{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Weight in pound:");
	double weight = sc.nextDouble();
	System.out.println("Enter height in inches:");
	double height = sc.nextDouble();
	
	double weightInKilograms = weight * 0.45359237;
	double heightInMeters = height * 0.0254;
	
	double bmi = weightInKilograms / (heightInMeters * heightInMeters);

	System.out.println("BMI :"+ bmi);
	}
}