class Swap
{
	static void swap(int a[])
	{
		int temp=a[0];
		a[0]=a[1];
		a[1]=temp;
	}
	
	
	
	public static void main(String[] args)
	{
		int arr[]={10,20};
		swap(arr);
		System.out.print("a ="+arr[0]+" "+"b="+arr[1]);
	}
}