
package MobileShopManagementSystem;
import java.util.Scanner;

public class MobileMainMenu
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        
        MobileShop mo=new MobileShop();
        int choice;
        do
        {
            System.out.println("\n=====Mobile Shop Menu====");
            System.out.println("1.Add Latesh launch");
            System.out.println("2.Add Regular stack");
            System.out.println("3.Display Mobiles");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the Brand Name:");
                    String name=sc.nextLine();
                    System.out.println("Enter the mobile Id:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the mobile price:");
                    double price=sc.nextDouble();
                    sc.nextLine();
                    mo.insertAtHead( name,id, price);
                    break;
                }
                case 2:
                {
                   
                    System.out.println("Enter the Brand Name:");
                    String name=sc.nextLine();
                    System.out.println("Enter the mobile Id:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the mobile price:");
                    double price=sc.nextDouble();
                    sc.nextLine();
                    mo.insertAtTail( name,id, price);
                    break;  
                }
                case 3:
                {
                    mo.display();
                    break;
                
                }
                case 4:
                {
                    System.out.println("Thanks for visiting ");
                    break;
                }
                default :
                {
                    System.out.println("Invalid choice");
                }
            
            }
                    
        
        }while(choice!=4);
    }
}




/*Design and develop a console-based Java application for a Mobile Shop Management System using a Singly Linked List.

System Requirements
The mobile shop must store the following details for each mobile:

Mobile ID (int)
Brand Name (String)
Price (double)

Functional Requirements

1. Insert a new mobile at the Head of the linked list

          This represents a Latest Launch Mobile (priority stock).

2. Insert a new mobile at the Tail of the linked list

         This represents a Regular Stock Mobile.

3. Display all available mobiles in the shop.
4. Provide a menu-driven console interface using:
        Scanner class
        Loop (do-while or while)
        Switch-case statement

Technical Requirements
Create a separate Node class for the mobile details.
Maintain a head reference in the linked list.
Implement:
        insertAtHead()
        insertAtTail()
       display()
Use proper object-oriented structure.



===== Mobile Shop Menu =====
1. Add Latest Launch
2. Add Regular Stock
3. Display Mobiles
4. Exit
Enter your choice: */