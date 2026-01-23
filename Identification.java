import java.util.Scanner;
class Identification
{
		
	public static void main(String[] args)
	{
		Identification obj=new Identification();
		obj.menu();
	}
	void menu()
		{
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[5];
			int newArr[]=new int[arr.length-1];
			int choice;
			int index=0;
			int deletionindex=0;
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
						addemployee(arr,index);
						break;
					}
					case 2:
					{
						deleteEmployee(arr,newArr,deletionindex);
						break;
					}
					case 3:
					{
						displayEmployee(arr);
						break;
					}
					case 4:
					{
						break;
					}
				}
			
			
			}while(choice!=4);
		}	
		void addemployee(int arr[],int index)
		{
			if(index<arr.length)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter employee id");
				arr[index]=sc.nextInt();
				index++;
				System.out.println("Employee id added");
				
			}
		}
		void deleteEmployee(int arr[],int newArr[],int deletionindex)
		{
			Scanner sc=new Scanner(System.in);
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
		void displayEmployee(int arr[])
		{
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
}