
package pkgenum;
import java.util.Scanner;

public class TrafficSignalMain 
{

    
     
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\n 1.Show meaning");
            System.out.println("2.Check stop or go");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 1:
                {
                    for(TrafficSignalEnum signal:TrafficSignalEnum .values())
                    {
                        System.out.println(signal+ "-"+signal.getMeaning());
                    }
                    break;
                        
                }
                case 2:
                {
                    System.out.print("Enter the signal(RED,YELLOW,GREEN):");
                    String input=sc.next().toUpperCase();
                    try
                    {
                        TrafficSignalEnum signal=TrafficSignalEnum.valueOf(input);
                        System.out.println("Meaning:"+signal.getMeaning());
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println("Invalid signal");
                    }
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
