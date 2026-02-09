import java.util.Scanner;
class ReverseDigit{
	static int num;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		num = sc.nextInt();
		int rev1 = isReverese(num);
		System.out.println("RevreseNumber:"+rev1);
	}
	public static int isReverese(int num)
	{
		
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}
}
	
		
		
			
		