import java.util.Scanner;
import java.util.Arrays;
class IntegerArray
{
	public static void main(String[] args)
	{
		IntegerArray obj= new IntegerArray();
		obj.mainMenu();
	}
	public void mainMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=sc.nextInt();
		int arr[]=new int[length];
		int choice;
		do
		{
			System.out.println("***********************");
			System.out.println("1.Accept array elements");
			System.out.println("2.Display array");
			System.out.println("3.Sort array");
			System.out.println("4.Search element");
			System.out.println("5.Exit");
			System.out.println("Enter the choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					for(int i=0;i<arr.length;i++)
					{
						System.out.println("Enter the "+i+"element");
						arr[i]=sc.nextInt();
					}
					break;
				}
				case 2:
				{
					for(int a:arr)
					{
						System.out.print(a+" ");
					}
					break;
				}
				case 3:
				{
					int[] newArr=divide(arr);
					System.out.println(Arrays.toString(arr));
					System.out.println("Array elements are sorted");
					break;
				}
				case 4:
				{
					do
					{
						System.out.println("1.linear search");
						System.out.println("2.Binary search");
						System.out.println("Enter your option");
						choice=sc.nextInt();
						System.out.println("Enter the searchvalue");
						int searchvalue=sc.nextInt();
						switch(choice)
						{
							case 1:
							{
								linearSearch(arr,searchvalue);
								break;
							}
							case 2:
							{
								binarySearch(newArr,searchvalue);
								break;
							}
						}
					}while(choice<=2);
					break;
				}
				case 5:
				{
					break;
				}
			}
			
		}while(choice!=5);
	}
	public int[] divide(int arr[])
	{
		if(arr.length==1)
		{
			return arr;
		}
		int mid= arr.length/2;
		int left[]=divide(Arrays.copyofRange(arr,0,mid));
		int right[]=divide(Arrays.copyofRange(arr,mid,arr.length));
		
		
		return merge(left,right);
		
	}
	public int[] merge(int left[],int right[])
	{
		int newArr[]=new int[left.length+right.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<left.length&&j<right.length)
		{
			if(left[i]<right[j])
			{
				newArr[k]=left[i];
				i++;
				k++;
			}
			if(left[i]>right[j])
			{
				newArr[k]=right[j];
				j++;
				k++;
			}
		}
		if(i<left.length)
		{
			newArr[k]=left[i];
			i++;
			k++;
		}
		if(j<right.length)
		{
			newArr[k]=right[j];
			j++;
			k++;
			
		}
		return newArr;
	}
	void linearSearch(int arr[], int searchvalue)
	{
		System.out.println("Enter the searchvalue");
		searchvalue=sc.nextInt();
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("Element found:"+i);
			return;
		}
		System.out.println("Element not  found");
	}
	void binarySearch(int newArr[],int searchvalue)
	{
		System.out.println("Enter the searchvalue");
		searchvalue=sc.nextInt();
		int left = 0;
        int right = arr.length-1;
        int mid = (left + right)/2;
        
        while(left <= right)
        {
            if(searchvalue == arr[mid])
            {
				System.out.println("searchvalue:"+mid);
                return;
            } 
			else if(searchvalue > arr[mid])
            {
                left = mid+1;
            } 
			else if(searchvalue < arr[mid])
            {
                right = mid-1;
            }
            mid = (left + right)/2;
        }
		System.out.println("searchvalue not found");
		
	}
}