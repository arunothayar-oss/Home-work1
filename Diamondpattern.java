class Diamondpattern
{
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int s=3;s>=i;s--)
			{
				System.out.print(" ");
			}
				for(int j=1;j<=(2*i-1);j++)
				{
					System.out.print("*");
				}
				System.out.println("");
		}
		for(int i=5;i<=7;i++)
		{
			for(int s=1;s<=(i-4);s++)
			{
				System.out.print(" ");
				
			}
			for(int j=15-(2*i);j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
