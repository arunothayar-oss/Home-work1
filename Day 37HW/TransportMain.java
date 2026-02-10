
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






/*  Develop a menu-driven Java program to implement a Transport Management System using Object Oriented Programming concepts.

Program Requirements:
Create an abstract class Transport with the following details:

Data members:

Passenger ID

Passenger Name

From City

To City

Distance

Fare

An abstract method calculateFare()

A method displayTicket() to display ticket details

Create two subclasses:

CityBus

Fare = Distance × 5

LuxuryBus

Fare = (Distance × 10) + 200

Implement a menu-driven program with the following options:

City Bus Booking

Luxury Bus Booking

Calculate Fare

Display Ticket

Exit

Allow the user to select a route from the following:

Chennai → Bangalore (350 km)

Chennai → Coimbatore (500 km)

Chennai → Madurai (460 km)

Chennai → Trichy (330 km)

Chennai → Salem (340 km)

Use runtime polymorphism to calculate the fare based on the selected transport type.

The program should continue execution until the user selects the Exit option.


Sample Input:

---- TRANSPORT MANAGEMENT SYSTEM ----
1. City Bus Booking
2. Luxury Bus Booking
3. Calculate Fare
4. Display Ticket
5. Exit
Enter your choice: 1

Enter Passenger ID: 101
Enter Passenger Name: Arun

Select Route:
1. Chennai -> Bangalore
2. Chennai -> Coimbatore
3. Chennai -> Madurai
4. Chennai -> Trichy
5. Chennai -> Salem
Enter route choice: 2
Ticket Booked Successfully

Enter your choice: 3
Fare Calculated Successfully

Enter your choice: 4

Sample Output:

----- TICKET DETAILS -----
Passenger ID   : 101
Passenger Name : Arun
Route          : Chennai -> Coimbatore
Distance       : 500.0 km
Total Fare     : ₹2500.0      */