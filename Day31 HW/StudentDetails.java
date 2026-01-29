class StudentDetails
{
	
	String name[]=new String[5];
	int id[]=new int[5];
	int index=0;
	void addStudentdetails(String n,int i)
	{
		if(index<5)
		{
			name[index]=n;//add name and id in same one because index will be same 
			id[index]=i;
			index++;
			System.out.println("student name  and id is added");
		}
		else
		{
			System.out.println("Student list is full");
		}
		
	}
	
	void display()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println(name[i]+"="+" "+id[i]);
			
		}
	}
}