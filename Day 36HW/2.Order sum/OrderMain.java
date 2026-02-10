
package Interface.Order;
import java.util.Scanner;
public class OrderMain 
{
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the name");
      String customerName =sc.nextLine();
      System.out.println("Enter the food item");
      String foodItem=sc.nextLine();
      System.out.println("Enter the price");
      double  price=sc.nextDouble();
      FoodOrder fo=new FoodOrder(customerName,foodItem,price);
      int choice;
      do 
      {
            System.out.println("1.Place order");
            System.out.println("2.View Bill");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                {
                    
                    fo.placeOrder();
                    break;
                }
                case 2:
                {
                  
                  fo.showBill();
                  break;
                }
                case 3:
                {
                    break;
                }
            }
        }while(choice!=3);
    }
    
}



    /*  Write a menu-driven Java console application to implement an Online Food Order System using the following object-oriented concepts:

Requirements

Create an interface named Order with the following methods:

placeOrder()

showBill()

Create a parent class named Customer that contains:

A data member to store the customer name

A constructor to initialize the customer name

Create a child class named FoodOrder that:

Inherits the Customer class

Implements the Order interface

Stores food item name and price

Uses a constructor to initialize all values

Implements the interface methods

Create a menu-driven main class that provides the following options:

Place Order

View Bill

Exit

The program should:

Accept user input using the Scanner class

Display appropriate output in the console

Use class and object concepts

Sample Menu Input:

--- Online Food Order System ---
1. Place Order
2. View Bill
3. Exit
Enter your choice:


Sample input and output:

Enter Customer Name: Ashwini
Enter Food Item: Veg Burger
Enter Price: 120

Order placed successfully!   */
