class CombineSpecialChar{
	public static void main(String[] args)
	{
		for(char ch=0;ch<=128;ch++)
		{
			if(!((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||(ch>=48 && ch<=57)))
			{
			
				System.out.print(ch+" ");
			}
		}
	}
}
		