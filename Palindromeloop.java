class Palindromeloop
{
	public static void main(String[] args)
	{
		int a=521;
		int temp=a;
		int sum=0;
		int rem=0;
		while(temp>0)
			{
				rem=temp%10;
				sum=rem+(sum*10);
				temp=temp/10;
			}
			if(a==sum)
			{
				System.out.println("The given number is palindrome");
			}
			else
			{
				System.out.println("The given number is not palindrome");
			}
		
	}
}