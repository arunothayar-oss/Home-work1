class InsertElement
{
	public static void main(String[] args)
	{
		int arr[]={10,20,30,40,50};
		int newArr[]=new int[arr.length+1];
		int insertindex=2;
		int insertvalue=25;
		for(int i=0;i<insertindex;i++)
		{
			newArr[i]=arr[i];
		}
		newArr[insertindex]=insertvalue;
		for(int i=insertindex;i<arr.length;i++)
		{
			newArr[i+1]=arr[i];
		}
		for(int i=0;i<newArr.length;i++)
		{
			System.out.print(newArr[i]+" ");
		}
		
	}
}