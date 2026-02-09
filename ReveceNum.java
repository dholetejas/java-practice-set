import java.util.Scanner;
class ReveceNum{
	static int num;
	static Scanner sc = new Scanner(System.in);
	static{
	System.out.println("Enter a number:");
	num =sc.nextnt();
	System.out.println("num"+num)
	m1();
	int rev1=rev(num);
	System.exit(0);
	
	
	
	public static void  m1(int num){
		
		int rev=0;
		int dup=num;
		int rem =dup%10;
		rev =rev*10+dup;
		dup/=10;
	}
	return rev;
}
	
		
		
	
		
	