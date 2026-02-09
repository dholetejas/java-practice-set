class  DoWhile9{
	public static void main(String[] args)
	{
		char ch =0;
		do{
			ch++;
			if((ch>48 && ch<=57)||(ch>65 && ch<=90) || (ch>97 && ch<=122))
			{
				System.out.print(ch+" ");
			}
		}while(ch<=128);
	}
}
	
