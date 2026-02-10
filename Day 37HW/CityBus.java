
package TransportManagement;


public class CityBus extends Transport
{
    int fare;
    CityBus(int passengerId,String passengerName,String fromCity,String toCity,
    int distance)
    {
        super(passengerId,passengerName,fromCity,toCity,distance);
    
    }
    @Override
    public void calculateFare()
    {
        fare=(distance*5);
    }
    @Override
    public void displayTicket()
    {
        System.out.println("passengerId"+passengerId);
        System.out.println("passengerName"+passengerName);
        System.out.println("fromCity"+fromCity);
        System.out.println("toCity"+toCity);
        System.out.println("distance"+distance);
        System.out.println("fare"+fare); 
    
    }
    
}
