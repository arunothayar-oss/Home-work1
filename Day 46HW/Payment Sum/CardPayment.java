
package threads;


public class CardPayment extends Payment
{
   CardPayment(double amount) 
   {
       super(amount);
   }
   @Override
   void pay()
   {
       System.out.println("Processing Card Payment...");
       try
       {
           Thread.sleep(1000);
           
       }
       catch(InterruptedException e)
       {
           System.out.println(e);
       }
       System.out.println("Card payment of"+amount+"completed");
   }
}
