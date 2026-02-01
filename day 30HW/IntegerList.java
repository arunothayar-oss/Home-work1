import java.util.Arrays;
import java.util.Scanner;
class IntegerList
{
	public static void main(String[] args)
	{
		IntegerList obj= new IntegerList();
		obj.mainMenu();
	}
	public void mainMenu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int length=sc.nextInt();
		int arr[]=new int[length];
		int newArr[]=null;
		int choice;
		int searchvalue;
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
					newArr=divide(arr);
					print(newArr);
					break;
				}
				case 4:
				{
					
					do
					{
						System.out.println("1.linear search");
						System.out.println("2.Binary search");
						System.out.println("3.Exit");
						System.out.println("Enter your option");
						choice=sc.nextInt();
						
						switch(choice)
						{
							case 1:
							{
								System.out.println("Enter the searchvalue");
							    searchvalue=sc.nextInt();
								linearSearch(arr,searchvalue);
				
								break;
							}
							case 2:
							{
								System.out.println("Enter the searchvalue");
							    searchvalue=sc.nextInt();
								binarySearch(newArr,searchvalue);
								break;
							}
							case 3:
							{
								break;
							}
							
						}
					}while(choice!=3);
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
		int left[]=divide(Arrays.copyOfRange(arr,0,mid));
		int right[]=divide(Arrays.copyOfRange(arr,mid,arr.length));
		
		
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
			if(left[i]<=right[j])
			{
				newArr[k]=left[i];
				i++;
				k++;
			}
			else
			{
				newArr[k]=right[j];
				j++;
				k++;
			}
		}
		while(i<left.length)
		{
			newArr[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length)
		{
			newArr[k]=right[j];
			j++;
			k++;
			
		}
		return newArr;
	}
	void linearSearch(int arr[], int searchvalue)
	{
		
		for (int i=0;i<arr.length;i++)
		{
			if (searchvalue==arr[i])
			{
			
				System.out.println("searchvalue:"+i);
				return;
			}
		}
		System.out.println("Element not fond");
		
	}
	void binarySearch(int newArr[],int searchvalue)
	{
		
		int left = 0;
        int right = newArr.length-1;
       
        
        while(left <= right)
        {
			int mid = (left + right)/2;
            if(searchvalue == newArr[mid])
            {
				System.out.println("searchvalue:"+mid);
				
                return;
            } 
			else if(searchvalue > newArr[mid])
            {
                left = mid+1;
            } 
			else if(searchvalue < newArr[mid])
            {
                right = mid-1;
            }
            
        }
		System.out.println("Element not found");
		
	}
	public void print(int[] arr)
    {
        for(int a : arr)
        {
            System.out.print(a+" ");
        }
    }
}



//Problem Statement:
//Write a menu-driven program that allows the user to perform the following operations on an integer array:

//Accept elements into the array.

//Display the array.

//Sort the array (user should choose sorting method: Bubble Sort, Selection Sort, or Merge Sort).

//Search for an element (user should choose searching method: Linear Search or Binary Search).

  //Exit the program.

  //Program Requirements:

  //The program should continue showing the menu until the user chooses Exit.

 //For Binary Search, the array must be sorted first (show a message if not sorted).

  //Each operation should display appropriate messages for successful or unsuccessful searches and sorting.

  //Sample Menu Example:

  //1. Accept array elements 2. Display array 3. Sort array 4. Search element 5. Exit Enter your choice:
  //If the user selects Search element, show another menu:

  //Choose searching method: 1. Linear Search 2. Binary Search Enter your choice: 
