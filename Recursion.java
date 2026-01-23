class Recursion
{
	public static void main(String[] args)
	{
		Recursion r1= new Recursion();
		int arr[]={10,20,30,40,50};
		int index =r1.linearsearch(0,arr,40);
		System.out.println(index);
	}
	public int linearsearch(int i,int arr[],int searchvalue)
	{
		if(i<arr.length)
		{
			if(arr[i]==searchvalue)
			{
				return i;
			}
			else
			{
				return linearsearch(++i, arr,searchvalue);
			}
			
		}
		return -1;
	}
}