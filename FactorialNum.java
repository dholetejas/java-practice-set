import java.util.Scanner;
class FactorialNum{
	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = sc.nextInt();
		int fact = findFact(num,1);
		System.out.println(num+":"+fact);
	}
	public static int findFact(int num,int fact)
	{
		fact*=num--;
		if(num==0)return fact;
		return findFact(num,fact);
	}
	
}	