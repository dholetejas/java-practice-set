import java.util.Scanner;
class UserInputOdd{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number Between 1 to 1000:");
		int num = sc.nextInt();
		if(num<1 || num>=1000)
		{
			System.out.println("INVALID NUMBER:"+num);
		}
		else{
			System.out.println("Odd number 1 to:"+num);
			
			for(int i=1;i<=num;i++)
			{
				if(!(i % 2==0)){
				
					System.out.print(i+" ");
				}
			}
		}
	}
}
