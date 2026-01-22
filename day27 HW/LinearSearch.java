class LinearSearch
{
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50};
		int searchvalue=30;
		LinearSearch obj= new LinearSearch();
		obj.search(arr,searchvalue);
	}
	void search(int arr[],int searchvalue)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(searchvalue==arr[i])
			{
				System.out.println("Element found:"+i);
				return;
			}
		}
		System.out.println("Element not found");
	}
}