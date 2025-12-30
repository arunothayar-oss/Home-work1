import java.util.Scanner;
class Multiple
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		if((num%3==0)&&(num%7==0))
		{
			System.out.println("It is the multiple of 3 and 7");
		}
		else if(num%7==0)
		{
			System.out.println("It is the multiple of 7");
			
		}
		else if(num%3==0)
		{
			System.out.println("It is the multiple of 3");
		}
		
		else
		{
			System.out.print("It is not the multiple of 3 and 7");
		}
	}
	
}