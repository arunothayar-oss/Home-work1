
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
