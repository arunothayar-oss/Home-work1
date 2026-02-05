
package TransportManagement;
import java.util.Scanner;

public class TransportMain 
{
    public static void main(String[] args) 
    {
      Scanner sc =new Scanner(System.in);
      int choice;
      Transport t=null;
      
      
      do
      {
          System.out.println("1.CityBus Booking");
          System.out.println("2.LuxuryBus Booking");
          System.out.println("3.calculate Fare");
          System.out.println("4.Ticket");
          System.out.println("5.Exit");
          System.out.println("Enter your choice:");
          choice=sc.nextInt();
          if(choice>=1&& choice<=2)
          {
              System.out.println("Enter the passenger Id");
              int id=sc.nextInt();
              sc.nextLine();
              System.out.println("Enter the passenger Name");
              String name=sc.nextLine();
              System.out.println("1.chennai to bangalore");
              System.out.println("2.chennai to coimbatore");
              System.out.println("3.chennai to madurai");
              System.out.println("4.chennai to trichy");
              System.out.println("5.Chennai to Salem");
              System.out.println("Enter your route");
              int route=sc.nextInt();
              sc.nextLine();
              String fromCity="Chennai";
              String toCity="";
              int distance=0;
              switch(route)
              {
                  case 1:
                  {
                    toCity="Bangalore";
                    distance=350;
                    
                  }
                  case 2:
                  {
                      toCity="Coimbatore";
                      distance=500;
                      
                  }
                  case 3:
                  {
                      toCity="Madurai";
                      distance=460;
                      
                  }
                  case 4:
                  {
                      toCity="trichy";
                      distance=330;
                        
                  }
                  case 5:
                  {
                      toCity="salem";
                      distance=340;
                  }
                }
          
                  if(choice==1)
                  {
                      t=new CityBus(id,name,fromCity,toCity,distance); 
                  }
                  else
                  {
                     t=new LuxuryBus(id,name,fromCity,toCity,distance); 
                  }
                  System.out.println("Booking successful");
          }
                  
                  
                  switch(choice)
                  {
                      case 3:
                      {
                          if(t!=null)
                          {
                          t.calculateFare();
                          System.out.println("Fare caluculated");
                                  
                          } 
                          else
                          {
                              System.out.println("please book the ticket");
                          }
                      }
                      case 4:
                      {
                        if(t!=null)
                          {
                            t.displayTicket();
                            System.out.println("Ticket booked");
                                  
                          } 
                          else
                          {
                              System.out.println("ticket not booked");
                          }
                      
                      }
                      case 5:
                      {
                          break;
                      }
                      
                   }
              
            }while(choice!=5);
    }
}
