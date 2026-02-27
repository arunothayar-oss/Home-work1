
package factorymethod;

public class SmsFactory extends NotificationFactoryAbstract
{
   @Override
    public Notification createNotification() 
    {
        return new SmsNotifications();
    } 
}
