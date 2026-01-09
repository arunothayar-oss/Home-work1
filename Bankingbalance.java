import java.util.Scanner;
class Bankingbalance
{
	static float balance;
	static Scanner sc= new Scanner(System.in);
	static void inputbalance()
	{
		System.out.println("Enter the input balance");
		balance=sc.nextFloat();
		
	}
	static void deposit()
	{
		System.out.println("Enter the deposit amount");
		float amount=sc.nextFloat();
		balance=balance+amount;
		displaybalance();
		
	}
	static void withdraw()
	{
		System.out.println("Enter the amount");
		float amount=sc.nextFloat();
		if(amount<=balance)
		{
			balance=balance-amount;
			System.out.println("withdraw is successful");
		}
		else
		{
			System.out.println("Error insufficient balance");
		}
		displaybalance();
	}
	static void displaybalance()
	{
		System.out.println("current balance"+balance);
	}
	public static void main(String[] args)
	{
		inputbalance();
		int choice;
		do
		{
			System.out.println("*******************");
			System.out.println("1.Deposit");
			System.out.println("2.withdraw");
			System.out.println("3.check Balance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					deposit();
					break;
				}
				case 2:
				{
					withdraw();
				
					break;
				}
				case 3:
				{
					displaybalance();
					
					break;
				}

				case 4:
					break;
				default:
					System.out.println("invalid choice");
			}
		}while(choice!=4);
	}
	
	
}