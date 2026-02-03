class Studentmark
{
	int id;
	String name;
	int marks[];
	int total;
	double average;
	Studentmark(int id,String name,int[] marks)			//input data
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	void total()
	{
		for(int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
	}
	void average()
	{
		average=((double) total/marks.length);	// double +int =double 
		
	}
	void display()
	{
		System.out.println(id);
		System.out.println(total);
		System.out.println(average);
		if(average>=50)
		{
			System.out.println("He passed the exam");
		}
		else
		{
			System.out.println("fail");
		}
	}
}