
package factorymethod;


public class PushNotifications implements Notification
{
     @Override
    public void sendMessage() 
    {
        System.out.println("Sending Push Notification...");
    }
}
