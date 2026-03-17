
package arrayszohoques;

public class DuplicateCharactersMain 

{
    public static void main(String[] args)
    {
        String str="programming";
        for (int i = 0; i < str.length(); i++)
   {
            
            boolean alreadyPrinted=false;
            //always count and this boolean restarts for every i loop
            for (int k = 0; k < i; k++) // this for checking the previous elements
            {
               if(str.charAt(i)==str.charAt(k))//i=4 =r already it count have taken 
               {                                //i=4 k=1 same r so already becomes true
                    alreadyPrinted=true;      // so break and skip the i=4 so no j loop 
                    break;          //i=5 continue
               }
                 
            }
            if(alreadyPrinted)
            {
                continue;
            }
            int count=1;
            for (int j = i+1; j < str.length(); j++) 
            {
                 if(str.charAt(i)==str.charAt(j))
                 {
                     count++;
                 }
            }
            if(count>1)
        {
            System.out.println(str.charAt(i));
        }
       
        }
        
    }
   
}

/*.Find Duplicate Characters in a String
Write a Java program to find duplicate characters in a string.

Sample Input

programming
Sample Output

r
g
m  */


