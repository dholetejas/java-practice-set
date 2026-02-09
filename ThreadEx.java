class ThreadEx{
	public static void main(String[] args)
	{
		System.out.println("main Start");
		ramesh("hello");
		System.out.println("Main ends");
	}
	public static void ramesh (String str)
	{
		System.out.println("ramesh Starts");
		System.out.println(str);
		int op = suresh ();
		
		System.out.println("ramesh ends");
	}
	public static int suresh(){
		System.out.println("suresh starts");
		ganesh(123);
		System.out.println("suresh ends");
		
		return 123;
	}
	public static void ganesh(int num)
	{
		System.out.println("ganesh starts");
		System.out.println("data"+num);
		System.out.println("ganesh ends");
	}
}
