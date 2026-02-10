
package employeemanagementsystem;


public class EmployeeManagementSystem
{
    public static void main(String[] args)
    {
        Employee em=new Employee("Alice",50000);
        em.displayInfo();
        Manager ma=new Manager("Rajini",100000.00,"Mechanic");
        ma.displayInfo();
    }
}
