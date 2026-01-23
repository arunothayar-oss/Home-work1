import java.util.Scanner;
class BubbleSort
{
	public static void main(String[]args)
	{
		BubbleSort obj=new BubbleSort();
		obj.sorted();
		
	}
	void sorted()
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int passes=0;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			passes++;
			for(int j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					
				}
				
			}
		}
		print(arr,passes,n);
	}
	 void print(int arr[],int passes,int n)
	 {
		 for(int i=0;i<n;i++)
		 {
			System.out.print(arr[i]+" "); 
			System.out.println("");
		 }
		 System.out.println("passes are:"+passes); 
		 
	 }
}