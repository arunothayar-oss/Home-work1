import java.util.Scanner;
class Arrayletters
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the row values:");
		int row=sc.nextInt();
		System.out.println("Enter the column values:");
		int column=sc.nextInt();
		char letters[][]=new char[row][column];
		for(int i=0;i<letters.length;i++)
		{
			for(int j=0;j<letters[i].length;j++)
			{
					System.out.print("Enter the  value of"+i+" "+j+"Index::");
					letters[i][j]=sc1.next().charAt(0);
			}
		}
		for(int i=0;i<letters.length;i++)
		{
			for(int j=0;j<letters[i].length;j++)
			{
				System.out.print(letters[i][j]+" ");
			}
			
			System.out.println("");
		}
		
		
	}
}

