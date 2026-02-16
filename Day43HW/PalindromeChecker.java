
package string.stringbuffer.stringbuilder;
import java.util.Scanner;

public class PalindromeChecker 
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the word:");
       String str=sc.nextLine();
       String reversed="";
       for(int i=str.length()-1;i>=0;i--)
       {
           reversed=reversed+str.charAt(i);
           
       }
       if(str.equals(reversed))
       {
           System.out.println("Given number is palindrome");
       }
       else
       {
           System.out.println("Given number is not palindrome");
       }
    }
}


/*Palindrome Checker

Write a Java program that:

Accepts a string from the user.

Checks whether it is a palindrome.

Print:

"Palindrome" or

"Not Palindrome"


👉 Do NOT use StringBuilder reverse().
👉 Use only String methods. */