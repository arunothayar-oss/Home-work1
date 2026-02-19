
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
