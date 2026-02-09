import java.util.Scanner;
class HighTowHighFiveCheck{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number:");
	int number = sc.nextInt();
	if(number%2==0 && number%5!=0){
		System.out.println("HighTwo");
	}
	if(number%5==0 && number%2!=0){
		System.out.println("HighFive");
	}
	if(number%2==0 && number%5==0){
		System.out.println("HighTwoHighFive");
	}
	}
}
	