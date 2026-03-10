
package arraylist;

import java.util.Scanner;


public class EmployeeArrayMain 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        EmployeeInfo[] employee=new EmployeeInfo[100];
        int count=0;
        int choice;
        do
        {
            System.out.println("1.Add the details of employee");
            System.out.println("2.View the details of employee");
            System.out.println("3.Search the Id");
            System.out.println("4.Exit");
            System.out.println("Enter the choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the employee Id:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the Employee Name:");
                    String name=sc.nextLine();
                    System.out.println("Enter the Employee Department");
                    String department=sc.nextLine();
                    employee[count]=new EmployeeInfo(id,name,department);
                    count++;
                    System.out.println("Employee Details added successfully");
                    break;
                }
                case 2:
                {
                    if(count==0)
                    {
                        System.out.println("No employee details or found");
                        
                    }
                    else
                    {
                        for (int i = 0; i < count; i++) 
                        {
                            employee[i].display(); 
                        }
                    
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the search Id:");
                    int searchId=sc.nextInt();
                    boolean found=false;
                    for (int i = 0; i < count; i++) 
                    {
                        
                        if(employee[i].id==searchId)
                    
                        {
                            employee[i].display(); 
                            found=true;
                            break;
                            
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Employee details not found");
                    }
                    break;
                
                }
                case 4:
                {
                    System.out.println("Thanks for coming");
                    break;
                }
                
            
            }
        }while(choice!=4);
        
    }
}
