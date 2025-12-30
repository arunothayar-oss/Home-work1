import java.util.Scanner;
class Electricitybill
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your unit:");
		int unit=sc.nextInt();
		if(unit<=100)
		{
			System.out.println("Enter your unit:"+(unit*5));
		}
		else if((unit>=101)&&(unit<=200))
		{
			System.out.println("Enter your unit:"+(unit*7));
		}
		else if(unit>200)
		{
			System.out.println("Enter your unit:"+(unit*10));
		}
		else 
		{
			System.out.println("invalid unit");
		}
	}
}