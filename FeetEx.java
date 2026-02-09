import java.util.Scanner;
class FeetEx{
	public static void main(String[] arg){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a value for feet:");
	double feet = sc.nextDouble();
	
	 double meter = feet * 0.305;
	System.out.println("Height in meter:"+ meter);
	}
}