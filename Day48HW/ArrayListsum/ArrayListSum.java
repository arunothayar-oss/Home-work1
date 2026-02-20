
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum 
{

    
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       ArrayList<Integer> al=new ArrayList<>();
       int choice;
       int sum=0;
       do
       {
           System.out.println("1 for Entry 2 for Exit");
           choice=sc.nextInt();
           if(choice==1)
           {
               System.out.println("Enter the value:");
               int value=sc.nextInt();
               al.add(value);
               sum=sum+value;
           }
       }while(choice!=2);
        System.out.println("sum of the values"+sum);
    }
    
}
