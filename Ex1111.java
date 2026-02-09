class Ex1111{
	public static void main(String[] args)
	{
		System.out.println(Math.pow(2.5,6));
		UserMath obj = new UserMath();
		System.out.println(Math.pow(2.5,6));
	}
}
class UserMath
{
	public double pow(double num,int power)
	{
		double op =1;
		for(int i=1;i<=power;i++)
			op*=num;
		return op;
	}
}