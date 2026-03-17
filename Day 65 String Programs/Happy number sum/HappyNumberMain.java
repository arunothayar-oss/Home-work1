
package arrayszohoques;

import java.util.Scanner;


public class HappyNumberMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        if(HappyNumber.isHappy(num))
        {
            System.out.println(num+"is a Happy number");
        }
        else
        {
            System.out.println(num +"is not a Happy number");
        }
    }
}
