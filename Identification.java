import java.util.Scanner;
class Identification
{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[0];
		int newArr[]=new int[arr.length-1];
		int choice;
		int index;
		int deletionindex=2;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Identification obj=new Identification();
		int arr[]=new int[0];
		int choice;
		int index;
		do
		{
			System.out.println("***********************");
			System.out.println("1.Add employee ID");
			System.out.println("2.Remove employee ID");
			System.out.println("3.Display employee IDs");
			System.out.println("4.Exit");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					obj.addemployee();
					break;
				}
				case 2:
				{
					Obj.deleteEmployee();
					break;
				}
				case 3:
				{
					Obj.displayEmployee();
					break;
				}
				case 4:
				{
					break;
				}
				
			}
			
		}while(choice!=4);
	}
		void addemployee()
		{
				
			int newArr[]=new int[index+1];
			for(int i=0;i<arr.length;i++)
			{
				newArr[i]=arr[i];
			}
			if(index<arr.length)
			{
				System.out.println("Enter employee id");
				newArr[index]=sc.nextInt();
				index++;
				System.out.println("Employee id added");
				
			}
		}
		void deleteEmployee()
		{
			System.out.println("Enter employeeId to remove:");
			deletionindex=sc.nextInt();
			for(int i=0;i<deletionindex;i++)
			{
				newArr[i]=arr[i];
			}
			for(int i=deletionindex+1;i<arr.length;i++)
			{
				newArr[i-1]=arr[i];
			}
			
		}
		void displayEmployee()
		{
			for(int i=0;i<newArr.length;i++)
			{
				System.out.print(newArr[i]+" ");
			}
			
			
		}
}