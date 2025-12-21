class Scholarship
{
	public static void main(String[] args)
	{
	int marks=85;
	boolean attendance=true;
	boolean discipline=true;
	boolean result= (marks>=35)&&(attendance||discipline);
	System.out.println("Pass&Eligible for scholarship:" +result);
	}
}