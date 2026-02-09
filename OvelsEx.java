import java.util.Scanner;
class OvelsEx{
	public static void main(String[] args){
	System.out.println("Enter a character:");
	char ch = new Scanner(System.in).next().
			toUpperCase().charAt(0);
	
	System.out.println(ch=='A' ||ch=='E' ||ch='I' ||ch=='O' ||ch=='U');
	}
}