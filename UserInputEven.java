import java.util.Scanner;
class UserInputEven{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number Between 1 to 500:");
		int num = sc.nextInt();
		if(num<1 || num>=500)
		{
			System.out.print("INVALID INPUT!!:"+num+	 "PLZ Enter Valid Number");
		}
		else{
			System.out.println("Even numer 1 to:"+num);
			for(int i=1;i<=num;i++)
			{
				if(i%2==0)
				{
					System.out.print(i+" ");
				}
			}
		}
	}
}
		
			