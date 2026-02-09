class ForLoop{
	public static void main(String[] args)
	{
		
		System.out.println("Starts");
		 int b=5;
		for(int i=1;i<=b;i++,b--)
		{
			System.out.println("hello");
			if(i==b)break;
		}
		System.out.println("Ends");
		
	}
}