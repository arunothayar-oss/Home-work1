package Singleton;
public class MainLogger 
{
    public static void main(String[] args) {

        MessageLogger logger = MessageLogger.getInstance();

        Thread t1 = new Thread(logger);
        Thread t2 = new Thread(logger);

        t1.start();
        t2.start();
    }
}