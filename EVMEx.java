import java.util.Scanner;
class EVMEx{
	static int BJP, NCP, SHIVSENA, MNS, NOTA ;
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Population:");
	int pop = sc.nextInt();
	//loop will iterate population time
	for(int i=1;i<=pop;i++)
	{      
		
		System.out.println();
		System.out.println("	WELCOME");
		System.out.println();
		System.out.println("1. BJP ");
		System.out.println("2. NCP ");
		System.out.println("3. SHIVSENA ");
		System.out.println("4. MNS");
		System.out.println("5. NOTA");
		System.out.println();
		System.out.print("Enter your vote:");
		int vote = sc.nextInt();
		switch(vote){
			case 1:{
				System.out.println("Modi hain to munkin hain");
				BJP++;
				break;
			}
			case 2:{
				System.out.println("RASHTRAWADI PUNHA");
				NCP++;
				break;
			}
			case 3:{
				System.out.println("THARKARE SARKAR");
				SHIVSENA++;
				break;
				}
			case 4:{
				System.out.println("RAJALA SATH DYA");
				MNS++;
				break;
				}
			case 5 :{
				System.out.println("GRADUATE VOTER");
				NOTA++;
				break;
				}
			default :{
				System.out.println("INVALID INPUT");
				i--;	//utilize the waste iteration due to invalid response
				break;
			}
		}
	}
	
	if(BJP>=NCP && BJP>=SHIVSENA && BJP>=MNS && BJP>=NOTA)
		System.out.println("BJP WON THE ELECTION "+BJP+ "Votes. ");
	
	else if(NCP>=BJP && NCP>=SHIVSENA && NCP>=MNS && NCP>=NOTA)
		System.out.println("NCP WON THE ELECTION "+NCP+ " Votes. ");

	else if(SHIVSENA>=BJP && SHIVSENA>=NCP && SHIVSENA>=MNS && SHIVSENA>=NOTA)
		System.out.println("SHIVSENA WON THE ELECTION "+SHIVSENA+ "Votes.");
	
	else if(MNS>=BJP && MNS>=NCP && MNS>SHIVSENA && MNS>=NOTA)
		System.out.println("MNS WON THE ELECTION "+MNS+ "Votes.");
	
	else
		System.out.println("NOTA has"+NOTA+"Votes NO one has won the election");
	}
}


			



	