
package threads;
import java.util.Scanner;

public class OnlinePaymentSystem 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount");
        double cardAmount=sc.nextDouble();
        System.out.println("Enter the amount");
        double upiAmount=sc.nextDouble();
        Payment card=new CardPayment(cardAmount);
        Payment upi=new UPIPayment(upiAmount);
        Thread t1=new Thread(card);
        Thread t2=new Thread(upi);
        t1.start();
        t2.start();
        
    }
         
}


/* 1.Online Payment System
(Abstraction + Inheritance + Polymorphism + Thread)

🔹 Question:
Design a payment system where:

Payment process is abstract

Card payment and UPI payment are two implementations

Both payments run in parallel using threads

📥 Sample Input:
Card Payment: 2000 UPI Payment: 1500
📤 Sample Output:
Card payment of 2000 completed UPI payment of 1500 completed  */