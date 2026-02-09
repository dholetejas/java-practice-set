class ForVowels{
	public static void main(String[] args)
	{
		System.out.println("Uppercase Vowels:");
		for(char ch='A';ch<='Z';ch++)
		{
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.print(ch+" ");
			}
			
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
	
		for(char ch='a';ch<='z';ch++)
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.print(ch+" ");
			}
		}

	}
}
			
