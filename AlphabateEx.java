import java.util.Scanner;
class AlphabateEx{
	public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a character:");
	char ch = sc.next().charAt(0);
	boolean op =(ch>='A' && ch<='Z') || (ch>=97 && ch<='z');
	System.out.println(op);
	}
}