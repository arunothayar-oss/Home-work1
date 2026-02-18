
package threads;


public class UPIPayment extends Payment
{
   UPIPayment(double amount) 
   {
       super(amount);
   }
   @Override
   void pay()
   {
       System.out.println("Processing upi Payment...");
       try
       {
           Thread.sleep(1000);
           
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
       System.out.println("UPI payment of"+amount+"completed");
   }
} 
