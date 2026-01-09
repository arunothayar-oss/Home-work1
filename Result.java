import java.util.Scanner;
class Result
{
	static int m1,m2,m3;
	static int total;
	static double percentage;
	static Scanner sc=new Scanner(System.in);
	static void inputmarks()
	{
		System.out.println("Enter the marks1:");
		m1=sc.nextInt();
		System.out.println("Enter the marks2:");
		m2=sc.nextInt();
		System.out.println("Enter the marks3:");
		m3=sc.nextInt();
	}
	static void calculatetotal()
	{
		total=m1+m2+m3;
		System.out.println("Total marks:"+total);
		
	}
	static void calculatepercentage()
	{
		percentage=total/3.0;
		System.out.println("percentage:"+percentage);
		
	}
	static void displayresult()
	{
		if(percentage>=40)
		{
				System.out.println("Result is pass");
		}
		else
		{
			System.out.println("Result is fail");
		}
	}
	
	static void displaygrade()
	{
		if(percentage>=75)
		{
			System.out.println("grade is A");
		}
		else if(percentage>=60&&percentage<=74)
		{
			System.out.println("grade is B");
		}
		else if(percentage>=40&&percentage<=59)
		{
			System.out.println("grade is c");
		}
		else
		{
			System.out.println("grade is F");
		}
		
	}
	public static void main(String[] args)
	{
		inputmarks();
		int choice;
		do
		{
			System.out.println("*******************");
			System.out.println("1.Display total");
			System.out.println("2.Display Percentage");
			System.out.println("3.Display result");
			System.out.println("4.Display grade");
			System.out.println("5.Exit");
			System.out.println("choose your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					calculatetotal();
					break;
				}
				case 2:
				{
					calculatetotal();
					calculatepercentage();
					break;
				}
				case 3:
				{
					calculatetotal();
					calculatepercentage();
					displayresult();
					break;
				}
				case 4:
				{
					calculatetotal();
					calculatepercentage();
					displaygrade();
					break;
				}
				case 5:
					break;
				default:
					System.out.println("invalid choice");
				
			}
		}while(choice!=5);
	}
}