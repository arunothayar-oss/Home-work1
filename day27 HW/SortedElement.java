class SortedElement 
{
	public static void main(String[] args)
	{
		int arr[]={2,5,8,12,16,23,38};
		int searchvalue=16;
		SortedElement obj=new SortedElement();
		obj.binarySearch(arr,searchvalue);
	}
	void binarySearch(int arr[],int searchvalue)
	{
		int left=0;
		int right=arr.length-1;
		int mid=(left+right)/2;
		while(left<=right)
		{
			if(searchvalue==arr[mid])
			{
				System.out.println("Element found:"+mid);
				return;
			}
			else if(searchvalue>arr[mid])
			{
				left=mid+1;
			}
			else if(searchvalue<arr[mid])
			{
				right =mid-1;
			}
			mid=(left+right)/2;
			
		}
		System.out.println("Element not found:");
	}
}