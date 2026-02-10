
package linkedlist;
import java.util.Scanner;

public class Amazon 
{
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        ShoppingCart ca=new ShoppingCart();
        int choice;
        
    
        do
        {
             System.out.println("1.Add the products in the cart");
             System.out.println("2.view cart Items");
             System.out.println("3.Exit");
             System.out.println("Enter the choice:");
             choice=sc.nextInt();
             switch(choice)
             {
                 case 1:
                 {
                     System.out.println("Add the productId");
                     int id=sc.nextInt();
                     sc.nextLine();
                     System.out.println("Add the productName");
                     String name=sc.nextLine();
                     System.out.println("Add the product Price");
                     double price=sc.nextDouble();
                     ca.addProducts(id,name,price);
                     break;
                 }
                 case 2:
                 {
                     ca.viewProducts();
                     break;
                 }
                 case 3:
                 {
                     System.out.println("Thankyou for shopping");
                     break;
                 }
            }



        }while(choice!=3);
    }

}

		/*	Design and implement a console-based Shopping Cart Application using a Singly Linked List in Java.
Each product added to the cart should be stored as a node in the linked list.
🔹 Requirements
Create a Product class that represents a node with the following data members:
productId (int)
productName (String)
price (double)
next (Product reference)
Create a ShoppingCart class to manage the singly linked list:
Maintain a head reference.
Implement an insertion method to add a product at the end of the linked list.
Create a menu-driven console application using Scanner with the following options:
Add Product to Cart
View Cart Items
Exit
The program should allow the user to add multiple products dynamically.
Only insertion operation is allowed
(No deletion, update, or search operations).
🔹 Constraints
Use Singly Linked List only
Do not use arrays or collections
Follow proper class and object concepts
Program should run continuously until the user chooses Exit*/

