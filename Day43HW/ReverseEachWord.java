
package string.stringbuffer.stringbuilder;

import java.util.Scanner;
public class ReverseEachWord 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence=sc.nextLine();
        String words[]=sentence.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
           StringBuilder sb=new StringBuilder(words[i]); 
           sb.reverse();
           result.append(sb);
           result.append(" ");
                   
        }
        System.out.println("Output:"+result.toString().trim());
                
    }
}
