import java.util.Scanner;
class StudentMain
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name");
		String name=sc.nextLine();
		System.out.println("Enter the no of marks");
		int n=sc.nextInt();
		int marks[]=new int [n];
		System.out.println("Enter the marks");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		
		Studentmark sm=new Studentmark(id,name,marks);
		sm.total();
		sm.average();
		sm.display();
		
	}
}