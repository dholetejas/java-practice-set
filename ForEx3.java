class ForEx3{
	public static void main(String[] args){
	
		for(char ch=65;ch<=90;ch+=2){
			System.out.print(ch+" ");
		}
		System.out.print("---------------------------------------");

		
		int step=1;
		for(char ch=65;ch<=90;ch+=step){
			
			System.out.print(ch+" ");
			step++;
              			
		}
			
		
	}
}