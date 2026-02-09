import java.utival.Scanner;
class Ex{
	public static void main(String[] args){
		System.out.println("Shopping starts");
		System.out.println("Enter your bill amount:");
		double billAmount = new Scanner(System.in).nextDouble();
		double disc=15;
		if( billAmount>=5000){
			System.out.println("you got"+disc+"%discount");
		 	billAmount = ( billAmount)-( billAmount/100)*disc;
		}
		System.out.println("Total Bill:" + billAmount+"rs");
		System.out.println("Shopping ends");
		}
}