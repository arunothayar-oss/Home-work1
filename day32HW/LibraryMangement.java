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


//Problem Statement:
//You are tasked to create a mini-library management system using Java classes, objects, and constructors. The system should:

//Keep track of multiple books. Each book has:

//bookId (int)

//title (String)

//author (String)

//isAvailable (boolean) → true if available, false if borrowed

//Use a constructor to initialize a book when it is added to the library.

//Implement methods:

//display() → Show book details (ID, title, author, availability)

//borrowBook() → Mark as borrowed if available, otherwise show message

//returnBook() → Mark as available

//Create a menu-driven console program with options:

//1. Add a new book

//2. Display all books

//3. Borrow a book

//4. Return a book

//5. Exit


//Use array of objects to store books (or ArrayList for advanced version).

