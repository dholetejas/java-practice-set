import java.util.Scanner;
class UserVowels{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str= sc.next().toUpperCase();
		
		for(char ch='A'; ch<='Z';ch++)
		{
			if(ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U')
			{
				System.out.print(ch+" ");
			}
			else{
				System.out.println("No found Vowels");
			}
		}
	}
}
		
		