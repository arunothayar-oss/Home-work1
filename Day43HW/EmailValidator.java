
package string.stringbuffer.stringbuilder;

import java.util.Scanner;

public class EmailValidator 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email:");
        String email=sc.nextLine();
        int atIndex=email.indexOf('@');
        int dotIndex=email.indexOf('.');
        if(atIndex>0&&dotIndex>atIndex)
        {
            System.out.println("Valid Email");
        }
        else
        {
            System.out.println("invalid Email");
        }
    }
       
}


/*Email Validator (Basic)

Write a program that:

Accepts an email ID.

Validate:

Must contain "@"

Must contain "."

"@" should come before "."


Print "Valid Email" or "Invalid Email"  */

