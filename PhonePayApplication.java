import java.util.*;
class   PhonePayApplication{
	static String MyPin=System.getenv("MyPin");
	static{
		Scanner sc = new Scanner(System.in);
		boolean assumpt = false;
		for(int i=3;i>=1;i--)
		{
			System.out.println("Enter your Pin:");
			String pin = sc.next();
			if(pin.equals(MyPin)){
				assumpt=true;
				break;
			}
			else{
			System.out.println("Invalid Pin");
			System.out.println("Attempt Left :"+(i-1));
			}
		}
		if(!assumpt)
		System.exit(0);
	}
	public static void main(String[] args){
		launchApplication();
	}
	public static void launchApplication(){
		System.out.println();
		System.out.println("PhonePay\nHOME PAGE ");
	}
}
	


		
	
	