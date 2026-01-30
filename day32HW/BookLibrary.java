import java.util.Scanner;
class BookLibrary
{
	int bookId[];
	String title[];
	String author[];
	boolean isAvailable;
	int index;
	Scanner sc;
	BookLibrary()
	{
		bookId=new int[50];
		title=new String[50];
		author=new String[50];
		index=0;
        sc=new Scanner(System.in);
	}
	void addbook()
	{
		if(index<bookId.length)
		{
			System.out.println("Enter the bookId");
			bookId[index]=sc.nextInt();
			System.out.println("Enter the booktile");
			title[index]=sc.nextLine();
			System.out.println("Enter the author");
			author[index]=sc.nextLine();
			index++;
			System.out.println("book is added");
		}
		else
		{
			System.out.println("booklist is full");
		}
	}
	void displayDetails()
	{
		for(int i=0;i<index;i++)
		{
			System.out.print(bookId[i]+" "+title[i]+" "+author[i]);
		}
	}
	void borrowBook()
	{
		if(isAvailable==false)
		{
			System.out.println("Book borrowed");
		}
		else
		{
			System.out.println("Book present");
		}
	}
	void returnBook()
	{
		if(isAvailable==true)
		{
			System.out.println("Book return");
		}
		else
		{
			System.out.println("Book not return");
		}
	}
}