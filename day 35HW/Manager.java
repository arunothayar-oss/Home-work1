
package employeemanagementsystem;


public class Manager extends Employee 
{
    String department;
    Manager(String name,double salary,String department)
    {
        super(name,salary);
        this.department=department;
        System.out.println("Employee info is created");
    }
    @Override
    void displayInfo()
    {
       System.out.println("Employeee Name:"+super.name);
       System.out.println("Employee salary:"+super.salary);
       System.out.println("Employee department:"+department);
    }
    
}

