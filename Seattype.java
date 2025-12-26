import java.util.Scanner;
class Seattype
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		{
		System.out.println("Choose your option:");
		}
		int seat=sc.nextInt();
		switch(seat)
		{
			case 1:
			System.out.println("General");
			break;
			case 2:
			System.out.println("Sleeper");
			break;
			case 3:
			System.out.println("AC 3 Tier");
			break;
			case 4:
			System.out.println("AC 2 Tier");
			break;
			case 5:
			System.out.println("First Class");
			break;
			default:
			System.out.println("Thank you");
			break;
		}
	}
}