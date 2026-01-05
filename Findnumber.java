import java.util.Scanner;
class Findnumber
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);	
	 System.out.print("Enter the starting number");
	 int start=sc.nextInt();
	 System.out.print("Enter the ending number");
	 int end=sc.nextInt();
	 int oddcount=0;
	 int evencount=0;
	 int oddsum=0;
	 int evensum=0;
	 int total=0;
	 for(int i=start;i<=end;i++)
	 {
		 int value=sc.nextInt();
		 System.out.println("Enter the value");
		 if(value%2==0)
		 {
			 System.out.println(value+"is even number");
			 evencount++;
			 evensum=evensum+value;
		 }
		 else
		 {
			System.out.println(value+"is not even number"); 
			oddcount++;
			oddsum=oddsum+value;
		 }
		 total=oddsum+evensum;
	 }
	 System.out.println("Evencount:"+evencount);
	 System.out.println("Oddcount:"+oddcount);
	 System.out.println("evensum:"+evensum);
	 System.out.println("oddsum:"+oddsum);
	 System.out.println("total:"+total);
	}
}