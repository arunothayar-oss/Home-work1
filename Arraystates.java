import java.util.Scanner;
class Arraystates
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the States value:");
		int states=sc.nextInt();
		System.out.println("Enter the cities value:");
		int cities=sc.nextInt();
		String india[][]=new String[states][cities];
		for(int i=0;i<india.length;i++)
		{
			for(int j=0;j<india[i].length;j++)
			{
				System.out.print("Enter the  value of"+i+" "+j+"Index::");
				india[i][j]=sc1.nextLine();
			}
		}
			for(int i=0;i<india.length;i++)
			{
				for(int j=0;j<india[i].length;j++)
				{
						System.out.print(india[i][j]+"  ");
				}
				System.out.println("");
			}
		
		
	}
}