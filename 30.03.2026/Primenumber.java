import java.util.Scanner;
class Primenumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		if(num==2||num==3||num==5||num==7)
		{
			System.out.println("It is the prime number ");
		}
		else if(num<=0||num%2==0||num%3==0||num%5==0||num%7==0)
		{
			System.out.println("It is the non prime number ");
		}
		else
		{
			System.out.println("It is the prime number ");
		}
	}
}