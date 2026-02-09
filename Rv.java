import java.util.Scanner;
class Rv{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		int rev = reversNum(num,0);
		System.out.println(num+ ":"+rev);
		
	}
	public static  int reversNum(int num,int rev)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num/=10;
		if(num==0)return rev;
		return rev;
	}
}
		
	
