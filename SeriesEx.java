class SeriesEx{
	public static void main(String[] args)
	{
		for(char ch='A';ch<='Z';ch+=2)
		{
			System.out.print(ch+" ");
		}
		System.out.println();
		System.out.println("----------------------------------");

		int step=1;
		for(char ch='A';ch<='Z';ch+=step)
		{
			System.out.print(ch+" ");
			step++;
		}
	}
}
			