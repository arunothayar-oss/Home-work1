
package factorymethod;

public class MainClass
{
    public static void main(String[] args)
    {
       NotificationFactoryAbstract emailFactory = new EmailFactory();
        Notification email = emailFactory.createNotification();
        email.sendMessage();

        // SMS Notification
        NotificationFactoryAbstract smsFactory = new SmsFactory();
        Notification sms = smsFactory.createNotification();
        sms.sendMessage();

        // Push Notification
        NotificationFactoryAbstract pushFactory = new PushFactory();
        Notification push = pushFactory.createNotification();
        push.sendMessage(); 
    }
}


/*You are developing a Notification System for an application.
The system should support multiple notification types without modifying client code.

🔹 Requirements:
Use Factory Method Design Pattern.

Create a Notification interface with a method:

sendMessage()

Implement the following notification types:

EmailNotification

SMSNotification

PushNotification

Create an abstract factory class NotificationFactory with a factory method:

createNotification()

Create separate concrete factory classes for each notification type.

In the main method:

Create notifications using factory classes

Call sendMessage() for each*/