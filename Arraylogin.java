import java.util.Scanner;
class Arraylogin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the length of user name:");
		int len1=sc.nextInt();
		System.out.print("Enter the length of password name:");
		int len2=sc.nextInt();
		String username[]=new String[len1];
		String password[]=new String[len2];
		int index=0;
		int choice;
		do
		{
			System.out.println("1.Registration");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter the user name:");
					username[index]=sc1.nextLine();
					System.out.println("Enter the password name:");
					password[index]=sc1.nextLine();
					index++;
					for(int i=0;i<index;i++)
					{
						System.out.println(username[i]+" ");
						System.out.println(password[i]+" ");
					}
					break;
				}
				case 2:
				{
					System.out.println("Enter the user name:");
					String u=sc1.nextLine();
					System.out.println("Enter the password name:");
					String p=sc1.nextLine();
					if(u.equals(username[i]))
					{
						if(p.equals(password[i]))
						{
							System.out.println("login successful:");
						}
						else
						{
							System.out.println("invalid password");
						}
					}
					else
						{
							System.out.println("incorrect username");
						}
						break;
					
				}
					case 3:
					{
						break;
					}
			}
			
		}while(choice!=3);
		
		
	}
}