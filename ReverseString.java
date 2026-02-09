import java.util.Scanner;
class ReverseString{
	static String str;;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Data:");
		str=sc.next();
		
		if(isPalindrome())
		{
			System.out.println(str+" Is Plaindrome");
		}
		else{
			System.out.println(str+" Is not Plaindrome"); 
		}
	}
	public static boolean isPalindrome()
	{
		String rev="";
		for(int i=0;i<str.length();i++)	
		{
			char ch=str.charAt(i);
			rev=ch+rev;
		}
		return str.equals(rev);
	}
}
		