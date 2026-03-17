

package arrayszohoques;



public class HappyNumber 
{
    public static boolean isHappy(int n)
    {
        while(n!=1&&n!=4)
        {
            n=sumofSquares(n);
        }
        return n==1; //true if n==1 is happy number 
    }
    public  static int sumofSquares(int n)
    {
        int sum=0;
        while(n>0)
        {
           int digit=n%10;
           sum=sum+(digit*digit);
           n=n/10;
            
        }
        return sum;
    }
}
