import java.util.Scanner;
class Ex1{
	public static void main(String[] args){
		System.out.println("Enter a number:");
		int num = new Scanner(System.in).nextInt();
		if(num%2==0 && num%5!=0);
		{
			System.out.println("HighTwo");
		}
		if(num%5==0 && num%2 !=0);
		{
			System.out.println("HighFive");
		}
		if(num%2==0 && num%5==0)
		{
			System.out.println("HighFiveHiTwo");
		}
			
	}
}