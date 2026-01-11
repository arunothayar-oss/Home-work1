import java.util.Scanner;
class Arraybook
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the length of book names");
		int len1=sc.nextInt();
		System.out.print("Enter the length of book id names");
		int len2=sc.nextInt();
		String bookname[]=new String[len1];
		int bookid[]=new int[len2];
		int index=0;
		int option=0;
		do
		{
			System.out.println("***********************");
			System.out.println("1.Addbooks");
			System.out.println("2.Display All books");
			System.out.println("3.Search book by id");
			System.out.println("4.Exit");
			System.out.println("Enter the option:");
			option=sc.nextInt();
			switch(option)
			{
				case 1:
				{
					System.out.println("Enter the book names:");
					bookname[index]=sc1.nextLine();
					System.out.println("Enter the book id ");  
					bookid[index]=sc.nextInt();
					index++;
					break;
				}
				case 2:
				{
					for(int i=0;i<index;i++)
					{
						System.out.println(bookname[i]+"\t"+bookid[i]);
					}
					break;
				}
				case 3:
				{
					System.out.println("Enter the search id");
					int searchid =sc.nextInt();
					for(int i=0;i<bookid.length;i++)
					
						if(searchid==bookid[i])
							{
								System.out.println("book found"+"\t "+ bookname[i]);
							}
						else
						{
							System.out.println("book  not found");
						}
					
						break;
				}
				
					case 4:
				
						break;
				
					default:
					
						System.out.println("invalid option");
			}
			
		}while(option!=4);
	}
}