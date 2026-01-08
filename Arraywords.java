import java.util.Scanner;
class Arraywords
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the length value:");
		int length=sc.nextInt();
		String names[]=new String[length];
		int index=0;
		int choice;
		do
		{
			System.out.println("1.Add students name:");
			System.out.println("2.Display the students name:");
			System.out.println("3.Exit program:");
			System.out.println("choose the choice:");
			choice=sc.nextInt();
			
				switch(choice)
				{
					case 1:
					{
						System.out.print("Add the students name:");
						names[index]=sc1.nextLine();
						index++;
						break;
					}
				
					case 2:
					{
						for(int i=0;i<index;i++)
						System.out.print(names[i]+" ");
						break;
					}
					case 3:
					{
						break;
				
				    }
					default:
					System.out.println("Enter the correct choice:");
					
				}
				
			
		}while(choice!=3);
	}
}