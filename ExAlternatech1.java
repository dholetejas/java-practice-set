class ExAlternatech1{
	public static void main(String[] args)
	{
		int step=1;
		char ch='A';
		while(ch<='Z')
		{
			System.out.print(ch+" ");
			ch+=step;
			step++;
		}
	}
}
		