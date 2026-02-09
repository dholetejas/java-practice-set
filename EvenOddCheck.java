import java.util.Scanner;
class EvenOddCheck{
	public static void main(String[] args){
	System.out.println("Enter a Number:");
	int number = new Scanner(System.in).nextInt();
	if(number%2==0){
		System.out.println("Number is even");
	}
	if(number%2!=0){
		System.out.println("Number is odd");
	}
	}
}