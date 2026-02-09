import java.util.Scanner;
class SumOfDigit1{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		int sum = sumOfDigit(num,0);
		System.out.println(num+":"+sum);
	}
	public static int sumOfDigit(int num,int sum)
	{
		sum+=num%10;
		num/=10;
		if(num==0)return sum;
		return sumOfDigit(num,sum);
	}
		
}		
		