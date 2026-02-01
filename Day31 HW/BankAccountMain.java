import java.util.Scanner;
class BankAccountMain
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    BankAccount ba=new BankAccount();
	    int option;
		do
		{
				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.Display balance");
				System.out.println("4.Exit");
				System.out.println("Enter the option");
				option=sc.nextInt();
				switch(option)
				{
					case 1:
					{
						System.out.println("Enter the amount");
						double amount= sc.nextDouble();
						ba.deposit(amount);
						break;
					}
					case 2:
					{
						System.out.println("Enter the withdraw amount");
						double drawamount=sc.nextDouble();
						ba.withdraw(drawamount);
						break;
					}
					case 3:
					{
						ba.display();
						break;
					}
					case 4:
					{
						break;
					}
				}
			
		}while(option!=4);
	}
}


	//Bank Account System
	//Question:
	//Create a menu-driven program using BankAccount class to:

	//1.Deposit

	//2.Withdraw

	//3.Display balance

	//4.Exit

	//(Initial balance = 1000)

	//Sample Input:
	//1 500 3 4
	//Sample Output:
	//Amount deposited Balance = 1500 Exit
