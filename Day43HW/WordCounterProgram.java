
package string.stringbuffer.stringbuilder;
import java.util.Scanner;

public class WordCounterProgram 
{

 
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence=sc.nextLine();
        int charCount=0;
        int vowelCount=0;
        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            if(ch !=' ')
            {
                charCount++;
            }
      
        char lower=Character.toLowerCase(ch);
        if(lower=='a'||lower=='e'||lower=='i'||lower=='o'||lower=='u')
        {
            vowelCount++;
        }
      }
        String words[]=sentence.split(" ");
        int wordcount=words.length;
        System.out.println("Characters with out spaces:"+charCount);
        System.out.println("Words:"+wordcount);
        System.out.println("Vowels:"+vowelCount);
            
                
              
        
                
    }
    
}
