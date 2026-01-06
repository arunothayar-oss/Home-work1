import java.util.Scanner;
class Arraymovies
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);	
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the length:");
		int length=sc.nextInt();
		String movies[]=new String[length];
		for(int i=0;i<movies.length;i++)
		{
			System.out.println("Enter the index:"+i);
			movies[i]=sc1.nextLine();
		}
		for(int i=0;i<movies.length;i++)
		{
			System.out.println("*************************");
			System.out.println("movie:"+movies[i]);
		}
	}
}