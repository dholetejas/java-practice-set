import java.util.Scanner;
class PinValidation{
	public static void main(String[] args)throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int storePin=1234;
		int duration=5000;
		
		outerLoop:
		for( ; ;)
		{
			int attempt=3;
	
			do{
				System.out.println();
				System.out.print("Enter your Pin:");
				int userPin = sc.nextInt();
				
				if(storePin==userPin){
					System.out.println("Phone Unlocked");
					break outerLoop;
					
				}else{
				System.out.println("Wrong Pin");
				System.out.println("Attempt left"+(attempt-1));
				}
				attempt--;
			}while(attempt!=0);
			
			System.out.println();
			System.out.println("Phone is Disabled for "+(duration/1000)+"seconds");
			Thread.sleep(duration);
			duration *=2;
		}
	}
}
				
					