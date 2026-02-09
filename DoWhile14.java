class DoWhile14{
	public static void main(String[] args)
	{
		char ch='A';
		do{
			
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.print(ch+" ");
				
			}
			ch++;
		}while(ch<='Z');
	}
}