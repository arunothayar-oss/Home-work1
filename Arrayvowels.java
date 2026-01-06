import java.util.Scanner;
class Arrayvowels
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the length:");
		int length =sc.nextInt();
		char vowels[]=new char[length];
		for(int i=0;i<vowels.length;i++)
		{
			System.out.println("Enter the index" +i);
			vowels[i]=sc1.next().charAt(0);
		}
		for(int i=0;i<vowels.length;i++)
		{
			System.out.println("vowels:"+vowels[i]);
		}
		
		
	}
}