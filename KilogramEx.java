import java.util.Scanner;
class KilogramEx{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of pounds:");
	float pound = sc.nextFloat();
	
	final float ONE_POUND = 0.454f;
	float kg = pound*ONE_POUND;
	System.out.println("Kg:" + kg);
	}
}
	