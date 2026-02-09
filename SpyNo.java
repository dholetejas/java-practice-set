import java.util.Scanner;
class SpyNo{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		int sum=0,dup=num,prod=1, a=0;
		while(num!=0)
		{
			a=num%10;
			sum+=a;
			prod*=a;
			num/=10;
		}
		if(sum==prod)
		{
			System.out.println("number is spy:"+num);
		}
			else{
				System.out.println("Not spy");
		}
	}
}


	