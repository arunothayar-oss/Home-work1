
package factorymethod;


public class SmsNotifications implements Notification
{
    @Override
    public void sendMessage() 
    {
        System.out.println("Sending SMS Notification...");
    }
}
