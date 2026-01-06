import java.util.Scanner;
class Arraymobile
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
		int length=sc.nextInt();
		long mobile[]=new long[length];
		for(int i=0;i<mobile.length;i++)
		{
		 System.out.println("Enter the index" +i);
		 mobile[i]=sc.nextLong();
		}
		for(int i=0;i<mobile.length;i++)
		{
			System.out.println("Mobile Numbers:"  +mobile[i]);
		}
	}
}