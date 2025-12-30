import java.util.Scanner;
class Category
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age:");
		int age=sc.nextInt();
		if(age<13)
		{
			System.out.println("child");
		}
		else if(age>=13&&age<=19)
		{
			System.out.println("Teenager");
		}
		else if(age>=20&&age<=59)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("senior");
		}
	}
}