class AsciiCharWhile1{
	public static void main(String[] args)
	{
		char ch=0;
		while(ch<=128)
		{
			
			if((ch>48 && ch<=57) || (ch>65 && ch<=90 ) || (ch>97 && ch<122))
			{
				System.out.print(ch+" ");
				
			}
			ch++;
		}
	}
}	