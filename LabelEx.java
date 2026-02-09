class LabelEx{
	public static void main(String[] args)
	{
		System.out.println("Main Execution Starts");
		
		evenOdd :{
				
				System.out.println("EvenOdd block Exection Starts");
				
				if(5%2==0){
					System.out.println("Even");
					break evenOdd;
				}
				else{
					System.out.println("Odd");
				}
				System.out.println("EvenOdd block Execution End");
			}
			System.out.println("main Execution End");
		}
}
			 