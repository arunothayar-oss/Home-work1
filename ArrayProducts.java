import java.util.Scanner;
class ArrayProducts
{
		Scanner sc=new Scanner(System.in);		
		String names[]=new String[5];
		double prices[]=new double[5];
		int gst[]=new int[5];
		int index=0;
		double totalprice;
		void inputnames()
		{
			if(index<names.length)
			{
				System.out.println("Enter the name of the products");
				names[index]=sc.nextLine();
				index++;
			}
			else
			{
				System.out.println("names are full");
			}
		}
		void inputprices()
		{
			if(index<prices.length)
			{
				System.out.println("Enter the price of the products");
				prices[index]=sc.nextDouble();
				index++;
			}
			else
			{
				System.out.println("prices are full");
			}
		}
		void gstpercentage()
		{
			if(index<gst.length)
			{
				System.out.println("Enter the gst for the products");
				gst[index]=sc.nextInt();
				index++;
			}
			else
			{
				System.out.println("percentage are full");
			}
		}
		void totalprice()
		{
			for(int i=0;i<index;i++)
			{
				totalprice=prices[i]+gst[i];
				System.out.println(totalprice);
			}
		}
		
		void displayproduct()
		{
			for(int i=0;i<index;i++)
			{
				System.out.println(names[i]+"	"+gst[i]+" ="+totalprice);
			}
		}
		public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayProducts obj=new ArrayProducts();
		String names[]=new String[5];
		double prices[]=new double[5];
		int gst[]=new int[5];
		int option;
		do
		{
			System.out.println("");
			System.out.println("1.Enter the product names and prices");
			System.out.println("2.Enter gst percentage");
			System.out.println("3.calculate and display gst");
			System.out.println("4.Exit");
			System.out.println("choose the option");
			option=sc.nextInt();
			switch(option)
			{
					case 1:
					{
						obj.inputnames();
						obj.inputprices();
						
						break;
					}
					case 2:
					{
						obj.gstpercentage();
						break;
					}
					case 3:
					{
						obj.displayproduct();
						break;
					}
					
					case 4:
					{
						break;
					}
					default :
						System.out.println("invalid option");
			}
		}while(option!=4);
		
		
		
		
	}
}