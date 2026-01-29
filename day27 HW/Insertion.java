class Insertion
{
	public static void main(String[] args)
	{
	int [] arr={25,20,29,23,26};
	int [] newArr= new int[arr.length+1];
	int insertindex= 3;
	int insertvalue=21;
	for(int i=0;i<insertindex;i++)
	{
		newArr[i]=arr[i];
	}
	newArr[3]=21;
	for(int i= insertindex;i<arr.length;i++)
	{
		newArr[i+1]=arr[i];
	}
	for(int a:newArr)
	{
		System.out.print(a+" ");
	}
	}
	
}