
package threads;


abstract public class Payment implements Runnable
{
    protected double amount;
    Payment(double amount)
    {
        this.amount=amount;
    }
    abstract void pay();
    @Override
    public void run()
    {
        pay();
    }
 }
