import java.util.Scanner;
class ArrayOperations
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=sc.nextInt();
		int numbers[]=new int[len];
		int option;
		int index=0;
		int sum=0;
		do
		{
			System.out.println("");
			System.out.println("1.Insert the elements in array");
			System.out.println("2.Display the array elements");
			System.out.println("3.Find the sum of all elements");
			System.out.println("4.Find the largest element");
			System.out.println("5.Exit");
			System.out.println("choose the option");
			option=sc.nextInt();
			switch(option)
			{
					case 1:
					{
						if(index<numbers.length)
						{
							System.out.println("Enter the element of array");
							numbers[index]=sc.nextInt();
							index++;
						}
						else
						{
							System.out.println("numbers are full");
						}
						break;
					}
					case 2:
					{
						for(int i=0;i<index;i++)
						{
							System.out.print(numbers[i]+" ");
							
						}
						break;
					}
					case 3:
					{
						for(int i=0;i<index;i++)
						{
							sum=numbers[i]+numbers[i+1];
							System.out.println(sum);
							
						}
						break;
					}
					
					case 5:
					{
						break;
					}
					default :
						System.out.println("invalid option");
			}
		}while(option!=5);
	}
}