import java.util.Scanner;
class Discount{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Bill Amount:");
	double billAmount = sc.nextDouble();
	double disc=15;
	if(billAmount >=5000){
		System.out.println("you got"+disc+"%discount");
	
	billAmount=(billAmount)-(billAmount/100)*disc;
	}
	System.out.println("Total Bill:"+billAmount);
	System.out.println("Shopping Ends");
	}
}