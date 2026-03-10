
package arraylist;


public class EmployeeInfo
{
    int id;
    String name;
    String department;

    public EmployeeInfo(int id, String name, String department) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    public void display()
    {
        System.out.println("Employee ID:"+id);
        System.out.println("Employee name:"+name);
        System.out.println("Employee Department:"+department);
 }
    
}
