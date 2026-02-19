package innerclass;
import java.util.Scanner;
public class ShoppingCart
{
    String cartOwnerName;
    ShoppingCart(String cartOwnerName)
    {
        this.cartOwnerName=cartOwnerName;
    }
    class Item
    {
        String itemName;
        int quantity;
        double[] priceHistory;
        Scanner sc=new Scanner(System.in);

        public Item(String itemName, int quantity, int priceCount) 
        {
            this.itemName = itemName;
            this.quantity = quantity;
            priceHistory=new double[priceCount];
        }
        void addPrices()
        {
            for (int i = 0; i <priceHistory.length ; i++)
            {
                System.out.println("Enter the price:");
                priceHistory[i]=sc.nextDouble();
            }
         }
        double getLatestPrice()
        {
            return priceHistory[priceHistory.length-1];
        }
        double calculateTotalBill()
        {
            return getLatestPrice()*quantity;
        }
        void displayCartDetails()
        {
            System.out.println("\n cart owner:"+cartOwnerName);
            System.out.println("item"+itemName);
            System.out.println("Quantity"+quantity);
            System.out.println("price History:");
            for (int i = 0; i <priceHistory.length ; i++) 
            {
                System.out.print(priceHistory[i]+" "); 
            }
            System.out.println("\n Latest price:"+getLatestPrice());
            System.out.println("total"+calculateTotalBill());
            
        }
        
        
        
    }
}
