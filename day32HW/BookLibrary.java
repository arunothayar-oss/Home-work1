import java.util.Scanner;
class BookLibrary
{
	int bookId[];
	String title[];
	String author[];
	boolean isAvailable[];
	int index;
	Scanner sc;
	BookLibrary()
	{
		sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=sc.nextInt();
		bookId=new int[length];
		title=new String[length];
		author=new String[length];
		index=0;
		isAvailable=new boolean[length];
		for(int i=0;i<length;i++)
		{
			isAvailable[i]=true;
		}
        
	}
	void addbook()
	{
		if(index<bookId.length)
		{
			System.out.println("Enter the bookId");
			bookId[index]=sc.nextInt();
			sc.nextLine();								//after nextInt string comes i have to write nextline
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
			System.out.print(bookId[i]+"\t "+title[i]+"\t "+author[i]);
			System.out.println("");
		}
	}
	void borrowBook()
	{
		
			System.out.println("Enter the search Id:");
			int searchId=sc.nextInt();
			for (int i=0;i<bookId.length;i++)
		{
			if(searchId==bookId[i])
			{
				if(isAvailable[i])//is available is one variable
				{
					System.out.println("buyer is ready to borrow");
					isAvailable[i]=false;
					return;
				}
				else
				{
					System.out.println("Book already borrowed");
				}
			}
		}
	}
	void returnBook()
	{
		
			System.out.println("Enter the search Id:");
			int searchId=sc.nextInt();
			for (int i=0;i<bookId.length;i++)
		{
			if(searchId==bookId[i])
			{
				if(!isAvailable[i])
				{
					isAvailable[i]=true;
					System.out.println("Book is returned");
					return;
				}
				else
				{
					System.out.println("Book not return");
				}
			}
		}
	}
}