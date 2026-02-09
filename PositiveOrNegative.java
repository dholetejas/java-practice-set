import java.util.Scanner;
class PositiveOrNegative{
	public static void main(String[] args){
	System.out.println("Enter a number:");
	int number = new Scanner(System.in).nextInt();
	if(number>0){
		System.out.println("Number is positive");
	}
	if(number<0){
		System.out.println("Number is negative");
	}
	}
}
	