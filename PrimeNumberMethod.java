import java.util.Scanner;
class PrimeNumberMethod{
	public static void main(String[] args)
	{
		System.out.println("Enter a number:");
		int num = new Scanner(System.in).nextInt();
		findFactor(num);
	}
	public static void findFactor(int num)
	{
		for(int i=1; i<=num; i++){
			if(num%i==0){
				System.out.println(i);
			}
		}
	}
}