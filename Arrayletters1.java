class Arrayletters1
{
	public static void main(String[] args)
	{
		char letters[][]={{'V','i','j','a','y'},{'A','j','i','t','h'},{'K','a','m','a','l'},{'S','i','m','b','u'}};
		for(int i=0;i<letters.length;i++)
		{
			for(int j=0;j<letters[i].length;j++)
			{
				System.out.print(letters[i][j]+" ");
			}
			System.out.println("");
		}
	}
}