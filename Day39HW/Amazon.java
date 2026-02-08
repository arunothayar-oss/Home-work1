
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
