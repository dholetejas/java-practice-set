import java.util.Scanner;
class Days{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int number = sc.nextInt();
		
		if(number<1 || number>7){
			System.out.println("INVALID INPUT");
			return;
		}
		String day = switch(number)
		{
			case 1 -> "MON";
			case 2 -> "TUE";
			case 3 -> "WED";
			case 4 -> "THU";
			case 5 -> "FRI";
			case 6 -> "SAT";
			case 7 -> "SUN";
			default ->"INVALID";
		};
		System.out.println(number+ " :"+day);
	}
}
					