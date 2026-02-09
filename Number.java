class Number{
	static int num=1;
	public static void main(String[] args)
	{
		printNumber();
	}
	public static void printNumber()
	{
		System.out.print(num+" ");
		if(num++ ==100)return;
		printNumber();
	}
}
		