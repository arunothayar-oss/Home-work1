
package singleton;


public class MainPrinter 
{
    public static void main(String[] args)
    {
       PrintManager print1=PrintManager.getInstance();
       PrintManager print2=PrintManager.getInstance();
       print1.print();
       print2.print();
       if(print1==print2)
       {
           System.out.println("both reference points are same object");
       }
       else
       {
           System.out.println("different object");
       }
    }
}
