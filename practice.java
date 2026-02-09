import java.util.Scanner;
class practice{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number : ");
		int n= sc.nextInt();
		
		
		
		for(int i=1;i<n;i++){
			if(n%i==0){
				System.out.println(n+" is not prime");
			}
		}
			
				System.out.println(n+" is prime");
			
			
				
		
	}
}
		