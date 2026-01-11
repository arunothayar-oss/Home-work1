import java.util.Scanner;
class Bankingbalance
{
	 float balance;
	 Scanner sc= new Scanner(System.in);
	 void inputbalance()
	{
		System.out.println("Enter the input balance");
		balance=sc.nextFloat();
		
		
	}
	 void deposit()
	{
		System.out.println("Enter the deposit amount");
		float amount=sc.nextFloat();
		balance=balance+amount;
		
		
	}
	 void withdraw()
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

	}
	 void displaybalance()
	{
		System.out.println("current balance"+balance);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		Bankingbalance obj=new Bankingbalance();
		obj.inputbalance();
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
					obj.deposit();
					break;
				}
				case 2:
				{
					obj.withdraw();
				
					break;
				}
				case 3:
				{
					obj.displaybalance();
					
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