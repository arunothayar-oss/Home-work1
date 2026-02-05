
package TransportManagement;

public abstract class Transport 
{
    int passengerId;
    String passengerName;
    String fromCity;
    String toCity;
    int distance;
    int  fare;
    Transport(int passengerId,String passengerName,String fromCity,String toCity,
    int distance)
    {
        this.passengerId=passengerId;
        this.passengerName=passengerName;
        this.fromCity=fromCity;
        this.toCity=toCity;
        this.distance=distance;
    
    }
    abstract  void calculateFare();
    void displayTicket()
    {
        System.out.println("passengerId"+passengerId);
        System.out.println("passengerName"+passengerName);
        System.out.println("fromCity"+fromCity);
        System.out.println("toCity"+toCity);
        System.out.println("distance"+distance);
        System.out.println("fare"+fare);
    
    }
    
    
}
