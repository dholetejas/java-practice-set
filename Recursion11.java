import java.util.Scanner;
class Recursion11{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	int rev = reverseNumber(num,0);
	System.out.println(num+ ":"+rev);
	}
	public static int  reverseNumber(int num,int rev)
	{
		rev=rev*10+(num%10);
		if(num==0)return rev;
		return reverseNumber(num/10,rev);
	}
}
		