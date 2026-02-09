class DoWhile13{
	public static void main(String[] args)
	{
		char ch='A';
		int step=1;
		do{
			System.out.print(ch+" ");
			ch+=step;
			step++;
		}while(ch<='Z');
	}
}
		