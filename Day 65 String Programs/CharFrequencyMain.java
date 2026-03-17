
package arrayszohoques;

import java.util.Scanner;


public class CharFrequencyMain 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string elements");
        String str=sc.nextLine();
        int[] count=new int[256];
        for (int i = 0; i < str.length(); i++)// to count frequency
        {
            count[str.charAt(i)]++; //i=0;b=1;i=1 a=1...i=3 a=2 like this
        }   // b=1,a=3,n=2
        for (int i = 0; i < str.length(); i++) 
        {
            if(count[str.charAt(i)]!=0)
            {
                System.out.println(str.charAt(i)+":"+count[str.charAt(i)]);
                count[str.charAt(i)]=0;//because a=3; after printing it 
               // it becomes count[a]=0 again if loop wont run
             // avoid duplicate values a=4 it wont enter if condition 
             //"" this indicates char to string
            }
            
        }
        
    }
 
}

/*Find Frequency of Characters in a String
Write a Java program to count the frequency of each character in a string.

Sample Input

banana
Sample Output

b : 1
a : 3
n : 2*/
