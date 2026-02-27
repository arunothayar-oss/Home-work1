
package factorymethod;


public class EmailFactory extends NotificationFactoryAbstract
{
   @Override
    public Notification createNotification() 
    {
        return new EmailNotification();
    } 
}
