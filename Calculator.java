class Calculator
{
	public static void main(String[] args)
	{
		Calculator obj=new Calculator();
		int d=obj.add(10,20);
		System.out.println(d);
	}
	 int add(int a, int b)
	{
		 int c=a+b;
		 return c;
		
	}
}