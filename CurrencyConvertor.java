import java.util.Scanner;
class CurrencyConvertor{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	for( ; ; )
	{
		System.out.println();
		System.out.println("    Welcome!!!!!");
		System.out.println();
		System.out.println("List of currency");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3.AED");
		System.out.println("4.GBP");
		System.out.println("5.AUD");
		System.out.println("6.JPY");
		System.out.println("7.CAD");
		System.out.println("For Exit enter 0");
		System.out.println();
		
		System.out.println("Enter your Amount:");
		float inr = sc.nextFloat();

		System.out.println("Enter the Currency code:");
		String code = sc.next().toUpperCase();
		boolean asump = true;

		float con =0;
		
		if(code.equals("USD"))
		{
			con= inr/85.5950f;
		}
		else if(code.equals("EUR"))
		{
			con=inr/100.427f;

		}
		else if(code.equals("AED"))
		{
			con= inr/22.6f;
		}
		else if(code.equals("GBP"))
		{
			con= inr/106;
		}
		else if(code.equals("AUD"))
		{
			con= inr/56;
		}
		else if(code.equals("CAD"))
		{
			con= inr/61;
		}
		else if(code.equals("JPY"))
		{
			con= inr/0.53f;
		}
		

		else if(code.equals("0"))
		{
			System.out.println();
			System.out.println("Thank you visit again");
			return;
		}
		else
		{
			System.out.println();
			System.out.println("INVALID Currency code i.e : "+code);
			asump = false;
		}
		if(asump){
			System.out.println(inr+ "INR : "+con+" "+code);
		}
	}
}
}

		
		