import java.util.Scanner;
class StudentDetailsMain
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		StudentDetails sd=new StudentDetails();
		int option;
		do
		{
			    System.out.println("1.Add students name:");
				System.out.println("2.display");
				System.out.println("3.exit");
				System.out.println("Enter the option");
				option=sc.nextInt();
				switch(option)
				{
					case 1:
					{
						System.out.println("Enter the Student name");
						String name=sc1.nextLine();
						System.out.println("Enter the Student id");
						int id=sc.nextInt();
						sd.addStudentdetails(name,id);
						break;
					}
					
					case 2:
					{
						sd.display();
						break;
					}
					case 3:
					{
						break;
					}
					
				}
		}while(option!=3);
	}
}


		//Student Management
		//Create a  Java program using a Student class to perform:

		//1.Add student details

		//2.Update student name

		//3.Display student details

		//4.Exit

		