class BankAccount
{
	double balance=1000.00;
	void deposit(double amount)
	{
		balance=balance+amount;
	}
	void withdraw(double drawamount)
	{
		if(drawamount<=balance)
		{
			balance=balance-drawamount;
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	void display()
	{
		System.out.println(balance);
	}
	
}