class ForEx1{
	public static void main(String[] args){
		// 0 to 100
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
		}
		//100 to 1
		for(int i=100;i>=1;i--)
		{
			System.out.print(i+" ");
		}
		//all ASCII charachters
		for(char ch=0; ch<=127;ch++)
		{
			System.out.print(ch+" ");
		}
		
		for(char ch=0;ch<=127;ch++)
		{
			if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
			
			}
				System.out.print(ch+" ");
		}
	}
}