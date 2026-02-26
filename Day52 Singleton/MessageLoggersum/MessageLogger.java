package Singleton;
class MessageLogger implements Runnable 
{

    private static MessageLogger instance;

    private MessageLogger() {}

    public static synchronized MessageLogger getInstance() {
        if (instance == null) {
            instance = new MessageLogger();
        }
        return instance;
    }

    @Override
    public void run() {
        logMessage("Message from thread");
    }

    public void logMessage(String msg) {
        System.out.println(Thread.currentThread().getName() + " : " + msg);
    }
}