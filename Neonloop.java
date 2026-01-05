class Neonloop
{
	public static void main(String[] args)
	{
		int a=9;
		int square=81;
		int sum=0;
		int rem=0;
		while(square>0)
		{
			rem=square%10;
			sum=sum+rem;
			square=square/10;
		}
		if(a==sum)
		{
			System.out.println("The given number is neon number");
			
		}
		else
		{
			System.out.println("The given number is not neon number");
			
		}
	}
}