import java.util.Scanner;
class YearEx{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a minutes:");
	long minutes = sc.nextLong();
	
	int totalMinutesInDay= 24*60;
	int  totalMinutesInYear = totalMinutesInDay * 365;
	
	long years = minutes/totalMinutesInYear;
	long remainingMinutes = minutes % totalMinutesInDay;
	long days = totalMinutesInDay/ remainingMinutes;
	
	System.out.println("Years :" + years);
	System.out.println("Days :" + days);
	}
}
 