class Palindrome{
	public static void main(String[] args)
	{
		String str="madam";
		String reverse=new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(reverse));

	}
}