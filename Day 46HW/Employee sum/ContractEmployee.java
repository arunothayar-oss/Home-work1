
package threads;


public class ContractEmployee extends Employee
{
    ContractEmployee(double salary)
    {
        super(salary);
    }
    @Override
    void calculateSalary()
    {
        System.out.println("contract Employee salary:"+salary);  
    }
}
