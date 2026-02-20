
package innerclass;
import java.util.Scanner;
public class ItemMain
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cart name");
        String owner=sc.nextLine();
        System.out.println("Enter the item name");
        String item=sc.nextLine();
        System.out.println("Enter the quantity name");
        int quantity=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the price length ");
        int priceLength=sc.nextInt();
        sc.nextLine();
        ShoppingCart.Item si=new ShoppingCart(owner).new Item( item, quantity, priceLength);
        si.addPrices();
        si.displayCartDetails();
    }
  
        
}
/*      Question:
Create a console-based Java application to manage a simple shopping cart using an Inner Class and Array.

Requirements:
1. Create an outer class named:
ShoppingCart
Variable:
cartOwnerName
2. Inside it, create an inner class named:
Item
Variables:
itemName
price
quantity
double[] priceHistory (Array to store last N price updates)

Program Features:
Add Item
Update Price History (store multiple price changes in array)
Calculate Total Bill
Display Cart Details
Exit

Functional Requirements:
Allow user to enter:
Cart owner name
Item name
Quantity
Number of price updates
Store price updates inside array
Use array loop to:
Calculate latest price
Calculate total bill (latest price × quantity)
Display full cart details
Sample Input:
Copy code

Enter Cart Owner Name: Arun
Enter Item Name: Headphones
Enter Quantity: 2
Enter Number of Price Updates: 3

Enter Prices:
1500
1400
1300
Expected Output:
Copy code

Cart Owner: Arun
Item Name: Headphones
Quantity: 2
Price History: 1500 1400 1300
Latest Price: 1300
Total Bill: 2600    */