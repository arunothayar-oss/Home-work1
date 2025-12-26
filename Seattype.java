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
			System.out.println("class: General");
			System.out.println("Ticket rate =rs150");
			break;
			case 2:
			System.out.println("class :Sleeper");
			System.out.println("Ticket rate = rs350");
			break;
			case 3:
			System.out.println("class :AC 3 Tier");
			System.out.println("Ticket rate = rs500");
			break;
			case 4:
			System.out.println("class: AC 2 Tier");
			System.out.println("Ticket rate = rs1000");
			break;
			case 5:
			System.out.println("class :First Class");
			System.out.println("Ticket rate = rs900");
			break;
			default:
			System.out.println("Thank you");
			break;
		}
	}
}