import java.util.Scanner;
class Arrayemployee
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the length:");
		int length=sc.nextInt();
		String designations[]= new String[length];
		for(int i=0;i<designations.length;i++)
		{
			System.out.println("Enter the index:"+i);
			designations[i]=sc1.nextLine();
		}
		for(int i=0;i<designations.length;i++)
		{
			System.out.println("******************************************");
			System.out.println("Employee designations:"+designations[i]);
		}
	}
}