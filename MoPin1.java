import java.util.Scanner;
class MoPin1{
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		int storePin = 1311;
		
		int duration = 10000;
		outerLoop:
		for( ; ; )
		{
			int attempt = 4;
		do{
			

			System.out.println();
			System.out.println("Enter your pin:");
			int userPin = sc.nextInt();
				
			if(userPin == storePin)
			{
				System.out.println();
				System.out.println("Your Phone is Unlocked");
				break outerLoop;
			}
			else{
				System.out.println();
				System.out.println("Wrong Pin!!!");
				System.out.println("Attempt left"+(attempt-1));
			}
			attempt--;
		}while(attempt!=0);
			System.out.println();
			System.out.println("Your phone is dissable"+(duration/1000)+"seconds");
			Thread.sleep(duration);
			duration*=2;
		
		}
	}				 
			
		
}	
	
		
			
		
		
		