class Ex1113{
	public static void main(String[] args)
	{
		System.out.println(Math.min(10,20));
		UserMath obj = new UserMath();
		System.out.println(Math.min(10,20));
	}
}
class UserMath
{
	public double min(int num,int num1)
	{
		double op=1;
		for(int i=1;i<=num1;i++)
			op*=num;	
		return op;
	}
}