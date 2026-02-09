import java.util.Scanner;
class NumberPalindrome{
	static int num;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entyer a number:");
		num = sc.nextInt();
		
		if((isPalindrome()))
		{
			System.out.println(num+"Is palindrome");
		}else{
			System.out.println(num+"Not palindrome");
		}
	}
	public static boolean isPalindrome()
	{
		int dup = num;
		int rev =0;
		
		while(dup!=0){
			int rem = dup%10;
			rev=rev*10+rem;
			dup/=10;
		}
		if(num==rev){
			return true;
		}
		else{
			return false;
		}
	}
}
	

