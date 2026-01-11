import java.util.Scanner;
class Result
{
	 int m1,m2,m3;
	 int total;
	 double percentage;
	 Scanner sc=new Scanner(System.in);
	void inputmarks()
	{
		System.out.println("Enter the marks1:");
		m1=sc.nextInt();
		System.out.println("Enter the marks2:");
		m2=sc.nextInt();
		System.out.println("Enter the marks3:");
		m3=sc.nextInt();
	}
    void calculatetotal()
	{
		total=m1+m2+m3;
		System.out.println("Total marks:"+total);
		
	}
    void calculatepercentage()
	{
		calculatetotal();
		percentage=total/3.0;
		System.out.println("percentage:"+percentage);
		
	}
    void displayresult()
	{
		calculatepercentage();
		if(percentage>=40)
		{
				System.out.println("Result is pass");
		}
		else
		{
			System.out.println("Result is fail");
		}
	}
	
	 void displaygrade()
	{
		calculatepercentage();
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
		Scanner sc=new Scanner(System.in);
		Result obj=new Result();
		obj.inputmarks();
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
					obj.calculatetotal();
					break;
				}
				case 2:
				{
					obj.calculatepercentage();
					break;
				}
				case 3:
				{
					obj.displayresult();
					break;
				}
				case 4:
				{
					obj.displaygrade();
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