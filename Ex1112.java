class Ex1112{
	public static void main(String[] args)
	{
		System.out.println(Math.abs(-23));
		UserMath obj = new UserMath();
		System.out.println(Math.abs(-23));
	}
}
class UserMath
{
	public double abs(double num,int power)
	{
		double op =1;
		for(int i=1;i<=power;i++)
			op*=num;
		return op;
	}
}