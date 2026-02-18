
package threads;


public class Employee extends Thread
{
    double salary;
    Employee(double salary)
    {
        this.salary=salary;
    }
    void calculateSalary()
    {
        System.out.println("Employee salary is calculated");
    }
    @Override
   public  void run()
    {
        calculateSalary();
    }
}
