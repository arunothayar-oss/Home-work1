
package threads;


public class PermanentEmployee extends Employee
{
    PermanentEmployee(double salary)
    {
        super(salary);
    }
    @Override
    void calculateSalary()
    {
        System.out.println("permanent Employee salary:"+salary);  
    }
}
