class Students
{
	public static void main(String[] args)
	{
	int totalstudents=50;
	int girlspercentage=40;
	int girls=(totalstudents*girlspercentage)/100;
	int boys= totalstudents-girls; 
	System.out.println("No of girls:"+girls);
	System.out.println("No of boys:"+boys);
	}
}
	