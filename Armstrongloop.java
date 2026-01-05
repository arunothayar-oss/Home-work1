class Armstrongloop
{
	public static void main(String[] args)
	{
		int a=153;
		int temp=153;
		int rem=0;
		int sum=0;
		while(temp>0)
			{
				rem=temp%10;
				sum=sum+(rem*rem*rem);
				temp=temp/10;
			}
				if(a==sum)
				{
					System.out.println("The given number is armstrong");
				}
				else
				{
					System.out.println("The given number is  not armstrong");
				}
	}
}