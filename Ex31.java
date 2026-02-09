import java.util.Arrays;
class Ex31{
	public static void main(String[] args){
		
		int op = addition(args[0],args[1]);
		
		System.out.println(op);
	}
	public static String palindrome(String str)
	{
		int rev ="";
		for(int i=str.length();i>=0;i++){
			rev = rev +str[i];
		}
		return rev;
	
	}
}