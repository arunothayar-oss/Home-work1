
package threads;


public class EmployeeTest 
{
    public static void main(String[] args)
    {
        Employee p=new PermanentEmployee(30000);
        Employee c=new ContractEmployee(20000);
        p.start();
        c.start();
    }
}
/* .Employee Salary Calculation
(Inheritance + Thread)

🔹 Question:
Create an employee system where:

Base class Employee

PermanentEmployee and ContractEmployee extend Employee

Salary calculation for both runs in separate threads

📥 Sample Input:
Permanent Employee Salary: 30000 Contract Employee Salary: 20000
📤 Sample Output:
Permanent Employee Salary Calculated Contract Employee Salary Calculated  */
