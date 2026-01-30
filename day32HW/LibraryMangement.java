import java.util.Scanner;
class LibraryMangement
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		BookLibrary bl=new BookLibrary();
		int option;
		do
		{
			   System.out.println("1.Add the books");
			   System.out.println("2.Display the books");
			   System.out.println("3.Borrow the books");
			   System.out.println("4.return the books");
			   System.out.println("5.exit");
			   System.out.println("Enter the option");
			   option=sc.nextInt();
			   switch(option)
			   {
				   case 1:
				   {
					   bl.addbook();
					   break;
				   }
				   case 2:
				   {
					   bl.displayDetails();
					   break;
				   }
				   case 3:
				   {
					   bl.borrowBook();
					   break;
				   }
				   case 4:
				   {
					   bl.returnBook();
					   break;
				   }
				   case 5:
				   {
					   break;
				   }
				   
			   }
		}while(option!=5);
	}
}