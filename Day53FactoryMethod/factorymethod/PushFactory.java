
package factorymethod;

public class PushFactory extends NotificationFactoryAbstract
{
   @Override
    public Notification createNotification() 
    {
        return new PushNotifications();
    } 
}
